public class Pilha {
    int vetorPilha[];
    int numero_elementos;

    public Pilha(int t){
        vetorPilha = new int[t];
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
        if(numero_elementos >= vetorPilha.length){
            return true;
        }else{
            return false;
        }
    }

    public int retornarElemento(){
        int elemento = vetorPilha[numero_elementos - 1];
        return elemento;
    }

    public void empilhar(int e){
        vetorPilha[numero_elementos] = e;
        numero_elementos += 1;
    }

    public void desempilhar(){
        numero_elementos -= 1;
    }

    public void printPilha(){
        for(int i = 0; i < numero_elementos; i++){
            System.out.print("[" + vetorPilha[i] + "]");
        }
        System.out.println();
    }
}
