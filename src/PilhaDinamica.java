
import java.util.EmptyStackException;

public class PilhaDinamica implements TADPilha {

    private Node topo;

    public PilhaDinamica() {
        topo = null;
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        int size = 0;
        Node aux = topo;

        while (aux != null) {
            aux = aux.proximo;
            size++;
        }

        return size;
    }

    @Override
    public void push(int elemento) {
        Node novo = new Node(elemento);
        novo.proximo = topo;
        topo = novo;
    }

    @Override
    public int pop() throws EmptyStackException {
        if (!isEmpty()) {
            Node aux = topo;
            topo = topo.proximo;
            aux.proximo = null;

            return aux.elemento;
        }
        throw new EmptyStackException();
    }

    @Override
    public int top() throws EmptyStackException {
        if (!isEmpty()) {
            return topo.elemento;
        }
        throw new EmptyStackException();
    }
}
