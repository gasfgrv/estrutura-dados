package br.com.gusto.fatec.pilha.estatica;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StaticStackTest {
    public static void staticStackTest() {
        StaticStack pilha = new StaticStack(10);
        pilha.push("São Paulo");
        pilha.push("Rio de Janeiro");
        pilha.push("Brasília");
        log.info(String.valueOf(pilha.showTop()));
        pilha.push("Belo Horizonte");
        log.info(String.valueOf(pilha.pop()));
        log.info(String.valueOf(pilha.pop()));
        log.info(String.valueOf(pilha.showTop()));
        pilha.push("São Carlos");
        log.info(String.valueOf(pilha.getSize()));
        while (!pilha.isEmpty()) pilha.pop();
    }
}
