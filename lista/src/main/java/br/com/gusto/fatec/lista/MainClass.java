package br.com.gusto.fatec.lista;

import static br.com.gusto.fatec.lista.dinamica.JLinkedListTest.jLinkedListTest;
import static br.com.gusto.fatec.lista.estatica.SequentialListTest.sequentialListTest;

public class MainClass {
    public static void main(String[] args) {
        sequentialListTest();
        jLinkedListTest();
    }
}
