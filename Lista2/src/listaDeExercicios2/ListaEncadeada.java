package listaDeExercicios2;

public class ListaEncadeada {
    private int[] elementos;
    private int tamanho;
    private static final int TAMANHO_INICIAL = 10;

    public ListaEncadeada() {
        this.elementos = new int[TAMANHO_INICIAL];
        this.tamanho = 0;
    }

    // Método para inserir um elemento no início da lista
    public void inserirInicio(int elemento) {
        if (tamanho == elementos.length) {
            redimensionar();
        }
        for (int i = tamanho - 1; i >= 0; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[0] = elemento;
        tamanho++;
    }

    // Método para inserir um elemento no fim da lista
    public void inserirFim(int elemento) {
        if (tamanho == elementos.length) {
            redimensionar();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    // Método para inserir um elemento em uma posição específica da lista
    public void inserirPosicao(int elemento, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        if (tamanho == elementos.length) {
            redimensionar();
        }
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    // Método para remover um elemento no início da lista
    public int removerInicio() {
        if (tamanho == 0) {
            throw new IllegalStateException("Lista vazia.");
        }
        int elementoRemovido = elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elementoRemovido;
    }

    // Método para remover um elemento no fim da lista
    public int removerFim() {
        if (tamanho == 0) {
            throw new IllegalStateException("Lista vazia.");
        }
        int elementoRemovido = elementos[tamanho - 1];
        tamanho--;
        return elementoRemovido;
    }

    // Método para remover um elemento em uma posição específica da lista
    public int removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        int elementoRemovido = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elementoRemovido;
    }

    // Método para remover um elemento específico da lista
    public boolean removerElemento(int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) {
                removerPosicao(i);
                return true;
            }
        }
        return false;
    }

    // Método para exibir o conteúdo da lista
    public void exibirLista() {
        System.out.println("Conteúdo da lista:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }

    // Método para pesquisar por um elemento específico na lista e retornar sua posição
    public int pesquisarElemento(int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    // Método que retorna o número de elementos existentes na lista
    public int tamanho() {
        return tamanho;
    }

    // Método privado para redimensionar o array quando necessário
    private void redimensionar() {
        int novoTamanho = elementos.length * 2;
        int[] novoArray = new int[novoTamanho];
        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = elementos[i];
        }
        elementos = novoArray;
    }
}
