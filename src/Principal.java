public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista(50);

        lista.adicionarFinal(3);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(5);
        lista.adicionarFinal(7);
        lista.adicionarFinal(9);

        lista.printLista();


        lista.eliminarRepetidos();

        lista.printLista();

    }
}
