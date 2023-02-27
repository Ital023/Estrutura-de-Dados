public class Filas {
//Filas as remocoes ocorrem no final da lista e a adicao acontece no inicio.
//FIFO (First in, First out)
    int vetorFilas[];
    int numero_elementos;

    public Filas(int t){
        vetorFilas = new int[t];
        numero_elementos = 0;
    }

    public int getQuantidade(){
        return numero_elementos;
    }

    public boolean estaVazia(){
        if(numero_elementos == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean estaCheia(){
        if(numero_elementos >= vetorFilas.length){
            return true;
        }else{
            return false;
        }
    }

    public int retornarElemento(int i){
        int numero = vetorFilas[i];
        return numero;
    }

    public void enfileirar(int e){
        vetorFilas[numero_elementos] = e;
        numero_elementos += 1;
    }

    public int desenfileirar(){
        int elemento_removido = vetorFilas[0];
        for(int i=1;i<numero_elementos;i++){
            vetorFilas[i - 1] = vetorFilas[i];
        }
        numero_elementos -= 1;
        return elemento_removido;
    }

    public void printFilas(){
        for (int i=0;i<numero_elementos;i++){
            System.out.print("[" + vetorFilas[i] + "]");
        }
        System.out.println();
    }

}
