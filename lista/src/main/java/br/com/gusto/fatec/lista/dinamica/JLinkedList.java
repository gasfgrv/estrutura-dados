package br.com.gusto.fatec.lista.dinamica;

import br.com.gusto.fatec.lista.dinamica.exception.UnderflowException;
import br.com.gusto.fatec.lista.dinamica.model.Node;
import lombok.extern.java.Log;

@Log
public class JLinkedList {
    protected Node head;
    protected Node tail;
    protected long size;

    public JLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node getFirst() throws UnderflowException {
        if (isEmpty()) throw new UnderflowException();
        return head;
    }

    public Node getLast() throws UnderflowException {
        if (isEmpty()) throw new UnderflowException();
        return tail;
    }

    public void insertFirst(Node novoNode) {
        novoNode.setNext(head);
        head = novoNode;
        size++;
        if (size == 1) tail = head;
    }

    public void insertLast(Node novoNode) {
        if (isEmpty()) insertFirst(novoNode);
        else {
            novoNode.setNext(null);
            tail.setNext(novoNode);
            tail = novoNode;
            size++;
        }
    }

    public Node removeFirst() throws UnderflowException {
        if (isEmpty()) throw new UnderflowException();
        Node removedItem = head;
        if (head == tail) head = tail = null;
        else head = head.getNext();
        size--;
        return removedItem;
    }

    public Node removeLast() throws UnderflowException {
        if (isEmpty()) throw new UnderflowException();
        Node removedItem = tail;
        if (head == tail) head = tail = null;
        else {
            Node current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            tail = current;
            current.setNext(null);
        }
        size--;
        return removedItem;
    }

    public void print() {
        if (isEmpty()) log.info("Lista vazia!");
        else {
            log.info("A lista �: ");
            Node current = head;

            while (current != null) {
                log.info(current.getElement() + "");
                current = current.getNext();
            }

            log.info("\n");
        }
    }

    public void get(int index) throws IndexOutOfBoundsException {
        if (isEmpty()) log.info("Erro: Lista vazia!");
        else if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        else {
            var posicaoAtual = 0;
            Node current = head;

            while (posicaoAtual < index) {
                current = current.getNext();
                posicaoAtual++;
            }

            log.info("Elemento na posição" + index + ": " + current.getElement());
        }
    }

    public void insertAfter(Node n, int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size) throw new IndexOutOfBoundsException();
        else if (pos == size - 1) insertLast(n);
        else {
            var posAtual = 0;
            Node current = head;

            while (posAtual < pos) {
                current = current.getNext();
                posAtual++;
            }

            n.setNext(current.getNext());
            current.setNext(n);
            size++;
        }
    }

    public void removeAfter(int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size) throw new IndexOutOfBoundsException();
        else if (pos == size - 1) log.info("ERRO: posi��o di ultimo da lista!");
        else {
            var posAtual = 0;
            Node current = head;

            while (posAtual < pos) {
                current = current.getNext();
                posAtual++;
            }

            current.setNext(current.getNext().getNext());
            size--;
        }
    }
}
