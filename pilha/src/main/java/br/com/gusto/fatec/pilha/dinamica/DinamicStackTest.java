package br.com.gusto.fatec.pilha.dinamica;

import br.com.gusto.fatec.pilha.dinamica.exception.EmptyStackException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DinamicStackTest {
    public static void dinamicStackTest() throws EmptyStackException {
        DinamicStack pilha = new DinamicStack();
        pilha.push('S');
        log.info(String.valueOf(pilha.showTop()));
        pilha.push('O');
        log.info(String.valueOf(pilha.pop()));
        log.info(String.valueOf(pilha.showTop()));
        pilha.push('O');
        pilha.push('T');
        pilha.push('A');
        pilha.push('F');
        log.info(String.valueOf(pilha.getSize()));
        while (!pilha.isEmpty()) {
            pilha.pop();
        }
    }
}
