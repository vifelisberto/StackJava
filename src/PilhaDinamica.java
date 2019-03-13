
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pop() throws EmptyStackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int top() throws EmptyStackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
