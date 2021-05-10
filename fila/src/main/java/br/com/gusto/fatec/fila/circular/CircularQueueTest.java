package br.com.gusto.fatec.fila.circular;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CircularQueueTest {

    public static void circularQueueTest() {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(90);
        queue.enqueue(900);
        queue.enqueue(9000);
        queue.enqueue(90000);
        queue.enqueue(900000);
        queue.showQueue();
        queue.enqueue(100);
        log.info(String.valueOf(queue.dequeue()));
        queue.enqueue(100);
        queue.showQueue();
    }
}
