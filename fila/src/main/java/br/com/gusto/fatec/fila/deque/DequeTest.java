package br.com.gusto.fatec.fila.deque;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DequeTest {

    public static void dequeTest() {
        Deque deque = new Deque(5);
        deque.enqueueFront(1);
        deque.enqueueFront(2);
        deque.enqueueRear(3);
        deque.enqueueRear(4);
        log.info(String.valueOf(deque.deleteRear()));
        deque.enqueueFront(3);
        deque.enqueueFront(4);
        deque.enqueueFront(5);
        log.info(String.valueOf(deque.deleteFront()));
        deque.showQueue();
    }
}
