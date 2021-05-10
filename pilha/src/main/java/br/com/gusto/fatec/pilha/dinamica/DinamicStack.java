package br.com.gusto.fatec.pilha.dinamica;

import br.com.gusto.fatec.pilha.dinamica.exception.EmptyStackException;
import br.com.gusto.fatec.pilha.dinamica.model.Node;

public class DinamicStack {
    private Node topo;
    private int size;

    public DinamicStack() {
        topo = null;
        size = 0;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int getSize() {
        return size;
    }

    public Object showTop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return topo.getElement();
    }

    public void push(Object element) {
        topo = new Node(element, topo);
        size++;
    }

    public Object pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        Object temp = topo.getElement();
        topo = topo.getNext();
        size--;
        return temp;
    }
}
