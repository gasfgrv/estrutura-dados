package br.com.gusto.fatec.lista.dinamica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Node {
    private String element;
    private Node next;

    public Node(String element) {
        this(element, null);
    }
}
