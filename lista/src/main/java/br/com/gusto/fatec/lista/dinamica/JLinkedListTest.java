package br.com.gusto.fatec.lista.dinamica;

import br.com.gusto.fatec.lista.dinamica.exception.UnderflowException;
import br.com.gusto.fatec.lista.dinamica.model.Node;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JLinkedListTest {
    public static void jLinkedListTest() {
        JLinkedList lista = new JLinkedList();
        try {
            lista.insertFirst(new Node("Adamastor"));
            lista.insertFirst(new Node("Dercy"));
            lista.insertFirst(new Node("Josefina"));
            log.info("Primeiro item: " + lista.getFirst());
            log.info("último item: " + lista.getLast());
            lista.insertLast(new Node("Jurandir"));
            log.info(String.valueOf(lista.removeFirst()));
            lista.insertAfter(new Node("Suzane"), 2);
            lista.get(0);
            log.info(String.valueOf(lista.removeLast()));
            lista.removeAfter(2);
            lista.print();
        } catch (IndexOutOfBoundsException boundsException) {
            log.info("Erro: índice inv�lido");
            boundsException.printStackTrace();
        } catch (UnderflowException underflowExceptionion) {
            log.info("Erro: Impossível remover");
            underflowExceptionion.printStackTrace();
        }
    }
}
