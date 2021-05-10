package br.com.gusto.fatec.heap;

public class Heap {
    int[] vetor;
    int n;

    public Heap(int t) {
        this.vetor = new int[t];
        n = 0;
    }

    public void insere(int elemento) {
        vetor[n + 1] = elemento;
        n++;
        subir(n);
    }

    public void subir(int filho) {
        int pai = filho / 2;
        if (pai >= 1 && vetor[filho] > vetor[pai]) {
            int aux;
            aux = vetor[filho];
            vetor[filho] = vetor[pai];
            vetor[pai] = aux;
            subir(pai);
        }
    }

    public void remover() {
        vetor[1] = vetor[n];
        n--;
        descer(1, n);
    }

    public void descer(int pai, int ultimo) {
        int filho = 2 * pai;
        if (filho <= ultimo) {
            if (filho < ultimo && vetor[filho + 1] > vetor[filho]) {
                filho++;
            }
            if (vetor[pai] < vetor[filho]) {
                int aux;
                aux = vetor[pai];
                vetor[pai] = vetor[filho];
                vetor[filho] = aux;
                descer(filho, ultimo);
            }
        }
    }

    public String printHeap(int p) {
        String retorno;
        retorno = "(";
        if (p <= n) {
            retorno += " " + vetor[p] + " ";
            retorno += printHeap(2 * p);
            retorno += printHeap(2 * p + 1);
        }
        retorno += ") ";
        return retorno;
    }
}
