//import java.util.EmptyStackException;

public class Principal {

    public static void main(String[] args) {
//        Pilha p = new Pilha(5);
//        p.push(5);
//        p.push(10);

        PilhaDinamica pd = new PilhaDinamica();
        System.out.println(pd.size());
        System.out.println(pd.isEmpty());
    }
}
