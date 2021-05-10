package br.com.gusto.fatec.pilha;

import br.com.gusto.fatec.pilha.dinamica.exception.EmptyStackException;

import static br.com.gusto.fatec.pilha.dinamica.DinamicStackTest.dinamicStackTest;
import static br.com.gusto.fatec.pilha.estatica.StaticStackTest.staticStackTest;

public class MainClass {
    public static void main(String[] args) throws EmptyStackException {
        dinamicStackTest();
        staticStackTest();
    }
}
