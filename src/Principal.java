public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista(50);
        Filas filas = new Filas(50);

        /*lista.adicionarFinal(2);
        lista.adicionarFinal(5);
        lista.adicionarFinal(7);
        lista.adicionarFinal(9);
        lista.adicionarFinal(8);*/

        filas.enfileirar(2);
        filas.enfileirar(5);
        filas.enfileirar(7);
        filas.enfileirar(9);
        filas.enfileirar(8);

        filas.printFilas();

        filas.desenfileirar();

        filas.printFilas();
    }
}
