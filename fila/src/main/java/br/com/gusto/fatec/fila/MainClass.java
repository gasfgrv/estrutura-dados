package br.com.gusto.fatec.fila;

import br.com.gusto.fatec.fila.circular.CircularQueueTest;
import br.com.gusto.fatec.fila.deque.DequeTest;
import br.com.gusto.fatec.fila.dinamica.DinamicQueueTest;
import br.com.gusto.fatec.fila.estatica.StaticQueueTest;

public class MainClass {

    public static void main(String[] args) {
        StaticQueueTest.staticQueueTest();
        DinamicQueueTest.dinamicQueueTest();
        CircularQueueTest.circularQueueTest();
        DequeTest.dequeTest();
    }

}
