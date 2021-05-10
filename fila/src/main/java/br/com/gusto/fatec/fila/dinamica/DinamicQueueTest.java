package br.com.gusto.fatec.fila.dinamica;

import br.com.gusto.fatec.fila.dinamica.exception.EmptyQueueException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DinamicQueueTest {

    public static void dinamicQueueTest() {
        DinamicQueue queue = new DinamicQueue();

        try {
            queue.enqueue('a');
            log.info(String.valueOf(queue.showFront()));
            queue.enqueue('b');
            queue.dequeue();
            log.info(String.valueOf(queue.showFront()));
            queue.enqueue('c');
            queue.dequeue();
            queue.dequeue();
            queue.enqueue('d');
            queue.enqueue('e');
            queue.enqueue('f');
            log.info(String.valueOf(queue.showFront()));
            queue.dequeue();
            log.info(String.valueOf(queue.showSize()));
            while (!queue.isEmpty()) {
                log.info(queue.dequeue() + "\n");
            }
        } catch (EmptyQueueException e) {
            log.warning("ERRO: Impossível remover!");
        }
    }
}
