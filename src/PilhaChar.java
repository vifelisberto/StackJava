import java.util.EmptyStackException;

public class PilhaChar {
    private char vetor[];
    private int topo;

    public PilhaChar(int tamanho) {
        vetor = new char[tamanho];
        topo = -1;
    }
    
    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == vetor.length - 1;
    }

    public int size() {
        return topo + 1;
    }

    public void push(char elemento) {
        if (!isFull()) {
            topo++;
            vetor[topo] = elemento;
        }
    }

    public char pop() throws EmptyStackException {
        if (!isEmpty()) {
            char retorno = vetor[topo];
            topo--;
            return retorno;
        }
        throw new EmptyStackException();
    }

    public char top() throws EmptyStackException {
        if (!isEmpty()) {
            return vetor[topo];
        }
        throw new EmptyStackException();
    }
    
}
