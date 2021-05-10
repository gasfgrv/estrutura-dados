package br.com.gusto.fatec.fila.dinamica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Node {
    private Object element;
    private Node next;

    public Node(Object element) {
        this(element, null);
    }
}