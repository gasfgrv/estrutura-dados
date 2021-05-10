package br.com.gusto.fatec.arvore.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private int element;
    private Node left;
    private Node right;

    public Node(int element, Node left, Node right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
}
