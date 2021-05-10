package br.com.gusto.fatec.pilha.estatica;

public class StaticStack {
    private final Object[] pilha;
    private int topo;

    public StaticStack(int n) {
        this.topo = -1;
        this.pilha = new Object[n];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return pilha.length == topo + 1;
    }

    public int getSize() {
        if(isEmpty()) return 0;
        return topo + 1;
    }

    public Object showTop() {
        if(isEmpty()) return null;
        return pilha[topo];
    }

    public void push(Object element) {
        if(!isFull()) pilha[++topo] = element;
    }

    public Object pop() {
        if(isEmpty()) return null;
        return pilha[topo--];
    }
}
