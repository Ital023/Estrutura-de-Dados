public class Lista {
    int vetor_elementos[];
    int numero_elementos;

    public Lista(int t){
        vetor_elementos = new int[t];
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
        if(numero_elementos >= vetor_elementos.length){
            return true;
        }else{
            return false;
        }
    }

    public int retornarElemento(int i){
        int elemento = vetor_elementos[i];
        return elemento;
    }

    public void adicionarInicio(int n){
        if(estaCheia()){
            System.out.println("Lista cheia");
        }else{
            for (int i = numero_elementos;i > 0; i--){
                vetor_elementos[i] = vetor_elementos[i - 1];
            }
            vetor_elementos[0] = n;
            numero_elementos += 1;
        }
    }

    public void adicionarFinal(int n){
        if(estaCheia()){
            System.out.println("Estrutura cheia!");
        }else{
            vetor_elementos [numero_elementos] = n;
            numero_elementos += 1;
        }
    }

    public int removerInicio(){
        if(estaVazia()){
            System.out.println("Estrutura vazia");
            return -1;
        }else{
            int item_removido = vetor_elementos[0];
            for(int i=1; i <= numero_elementos;i++){
                vetor_elementos[i - 1] = vetor_elementos[i];
            }
            numero_elementos -= 1;
            return item_removido;
            }
        }

    public int removerFinal(){
        if(estaVazia()){
            System.out.println("Estrutura vazia");
            return -1;
        }else{
            int item_removido = vetor_elementos[numero_elementos - 1];
            numero_elementos -= 1;
            return item_removido;
        }
    }

    public void adicionarPosicao(int e, int i){
        if(estaCheia()){
            System.out.println("Lista esta cheia");
        }else if(i == 0){
            adicionarInicio(e);
        }else if(i >= numero_elementos){
            adicionarFinal(e);
        }else{
            for(int indice=numero_elementos;indice>i;indice--){
                vetor_elementos[indice] = vetor_elementos[indice - 1];
            }
            vetor_elementos[i] = e;
            numero_elementos += 1;
        }
    }

    public int removerPosicao(int i){
        if(estaVazia()){
            System.out.println("Lista vazia");
            return -1;
        }else if (i<=0){
            return removerInicio();
        }else if(i >= numero_elementos){
            return removerFinal();
        }else{
            int elemento_removido = vetor_elementos[i];
            for(int indice = i;indice <= numero_elementos;indice++){
                vetor_elementos[indice - 1] = vetor_elementos[indice];
            }
            numero_elementos -= 1;
            return elemento_removido;
        }
    }

    public void printLista(){
        for(int i=0;i<numero_elementos;i++){
            System.out.print("[" + vetor_elementos[i] + "]");
        }
        System.out.println();
    }
}
