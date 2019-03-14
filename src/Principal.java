
import java.util.EmptyStackException;

//import java.util.EmptyStackException;
public class Principal {

    public static void main(String[] args) {
//        Pilha p = new Pilha(5);
//        p.push(5);
//        p.push(10);

        PilhaDinamica pd = new PilhaDinamica();
        System.out.println("Tamanho Pilha: " + pd.size());
        System.out.println("Pilha Vazia? " + (pd.isEmpty() ? "Sim" : "Não"));
        pd.push(5);
        pd.push(1);
        pd.push(10);
        pd.push(3);

        System.out.println("Tamanho Pilha: " + pd.size());
        System.out.println("Pilha Vazia? " + (pd.isEmpty() ? "Sim" : "Não"));

        try {
            System.out.println("Removido: " + pd.pop());
            System.out.println("Removido: " + pd.pop());
            System.out.println("Removido: " + pd.pop());
            System.out.println("Removido: " + pd.pop());
            System.out.println("Removido: " + pd.pop());
            System.out.println("Removido: " + pd.pop());
            System.out.println("Removido: " + pd.pop());
        } catch (EmptyStackException ex) {
            System.out.println("Pilha vazia, não é mais possível remover!");
        }
    }
}
