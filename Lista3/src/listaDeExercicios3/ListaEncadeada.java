package listaDeExercicios3;

public class ListaEncadeada {
    private class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private No primeiro;
    private int tamanho;

    public ListaEncadeada() {
        this.primeiro = null;
        this.tamanho = 0;
    }

    // Métodos de inserção

    public void inserirInicio(int elemento) {
        No novoNo = new No(elemento);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            novoNo.proximo = primeiro;
            primeiro = novoNo;
        }
        tamanho++;
    }

    public void inserirFim(int elemento) {
        No novoNo = new No(elemento);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        tamanho++;
    }

    public void inserirPosicao(int elemento, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        if (posicao == 0) {
            inserirInicio(elemento);
        } else if (posicao == tamanho) {
            inserirFim(elemento);
        } else {
            No novoNo = new No(elemento);
            No anterior = null;
            No atual = primeiro;
            for (int i = 0; i < posicao; i++) {
                anterior = atual;
                atual = atual.proximo;
            }
            anterior.proximo = novoNo;
            novoNo.proximo = atual;
            tamanho++;
        }
    }

    // Métodos de remoção

    public int removerInicio() {
        if (primeiro == null) {
            throw new IllegalStateException("Lista vazia.");
        }
        int elementoRemovido = primeiro.valor;
        primeiro = primeiro.proximo;
        tamanho--;
        return elementoRemovido;
    }

    public int removerFim() {
        if (primeiro == null) {
            throw new IllegalStateException("Lista vazia.");
        }
        if (primeiro.proximo == null) {
            int elementoRemovido = primeiro.valor;
            primeiro = null;
            tamanho--;
            return elementoRemovido;
        }
        No anterior = null;
        No atual = primeiro;
        while (atual.proximo != null) {
            anterior = atual;
            atual = atual.proximo;
        }
        int elementoRemovido = atual.valor;
        anterior.proximo = null;
        tamanho--;
        return elementoRemovido;
    }

    public int removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        if (posicao == 0) {
            return removerInicio();
        } else if (posicao == tamanho - 1) {
            return removerFim();
        } else {
            No anterior = null;
            No atual = primeiro;
            for (int i = 0; i < posicao; i++) {
                anterior = atual;
                atual = atual.proximo;
            }
            anterior.proximo = atual.proximo;
            tamanho--;
            return atual.valor;
        }
    }

    public boolean removerElemento(int elemento) {
        if (primeiro == null) {
            return false;
        }
        if (primeiro.valor == elemento) {
            removerInicio();
            return true;
        }
        No anterior = primeiro;
        No atual = primeiro.proximo;
        while (atual != null) {
            if (atual.valor == elemento) {
                anterior.proximo = atual.proximo;
                tamanho--;
                return true;
            }
            anterior = atual;
            atual = atual.proximo;
        }
        return false;
    }

    // Métodos de exibição e pesquisa

    public void exibirLista() {
        System.out.println("Conteúdo da lista:");
        No atual = primeiro;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }

    public int pesquisarElemento(int elemento) {
        No atual = primeiro;
        int posicao = 0;
        while (atual != null) {
            if (atual.valor == elemento) {
                return posicao;
            }
            atual = atual.proximo;
            posicao++;
        }
        return -1;
    }

    // Métodos de tamanho e criação da lista vazia

    public int tamanho() {
        return tamanho;
    }

    public void criarListaVazia() {
        primeiro = null;
        tamanho = 0;
    }
}
