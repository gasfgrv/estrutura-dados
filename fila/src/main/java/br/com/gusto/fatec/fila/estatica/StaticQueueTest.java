package br.com.gusto.fatec.fila.estatica;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StaticQueueTest {

    public static void staticQueueTest() {
        StaticQueue queue = new StaticQueue(5);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        log.info(String.valueOf(queue.showFront()));
        log.info(String.valueOf(queue.dequeue()));
        log.info(String.valueOf(queue.dequeue()));
        log.info(String.valueOf(queue.showFront()));
        log.info(String.valueOf(queue.dequeue()));
        log.info(String.valueOf(queue.showFront()));
    }
}
