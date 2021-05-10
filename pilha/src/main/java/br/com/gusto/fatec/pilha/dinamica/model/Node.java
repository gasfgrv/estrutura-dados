package br.com.gusto.fatec.pilha.dinamica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Node {
    private Object element;
    private Node next;
}
