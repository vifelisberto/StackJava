import java.util.EmptyStackException;

public class Pilha implements TADPilha {
    private int vetor[];
    private int topo;

    public Pilha(int tamanho) {
        vetor = new int[tamanho];
        topo = -1;
    }
    
    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == vetor.length - 1;
    }

    @Override
    public int size() {
        return topo + 1;
    }

    @Override
    public void push(int elemento) {
        if (!isFull()) {
            topo++;
            vetor[topo] = elemento;
        }
    }

    @Override
    public int pop() throws EmptyStackException {
        if (!isEmpty()) {
            int retorno = vetor[topo];
            topo--;
            return retorno;
        }
        throw new EmptyStackException();
    }

    @Override
    public int top() throws EmptyStackException {
        if (!isEmpty()) {
            return vetor[topo];
        }
        throw new EmptyStackException();
    }
    
}
