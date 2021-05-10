package br.com.gusto.fatec.fila.dinamica;

import br.com.gusto.fatec.fila.dinamica.exception.EmptyQueueException;
import br.com.gusto.fatec.fila.dinamica.model.Node;

public class DinamicQueue {
    private Node first;
    private Node last;

    public DinamicQueue() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int showSize() {
        var size = 0;
        if (first == null) return size;
        Node current = first;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public Object showFront() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException();
        return first.getElement();
    }

    public void enqueue(Object element) {
        Node newNode = new Node(element);
        if (last == null) {
            first = null;
            last = null;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public Object dequeue() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException();
        Object tmp = first.getElement();
        if (first == last) {
            first = null;
            last = null;
        } else first = first.getNext();
        return tmp;
    }
}
