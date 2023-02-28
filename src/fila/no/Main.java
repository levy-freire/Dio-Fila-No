package fila.no;

public class Main {
    public static void main(String[] args) {

        fila<String> minhaFila = new fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeeu());

        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

    }
}
