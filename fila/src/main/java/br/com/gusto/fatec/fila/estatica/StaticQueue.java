package br.com.gusto.fatec.fila.estatica;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.IntStream;

@Slf4j
@Getter
@Setter
public class StaticQueue {
    private Object[] queue;
    private int first;
    private int last;

    public StaticQueue(int n) {
        this.first = -1;
        this.last = -1;
        this.queue = new Object[n];
    }

    public boolean isEmpty() {
        return this.last == -1;
    }

    public boolean isFull() {
        return queue.length == last + 1;
    }

    public int getSize() {
        if (this.isEmpty()) return 0;
        return this.last + 1;
    }

    public Object showFront() {
        if (this.isEmpty()) return null;
        return this.queue[this.first];
    }

    public void enqueue(Object element) {
        if (isEmpty()) {
            first = 0;
            last = 0;
            this.queue[last] = element;
        } else if (!isFull()) this.queue[++last] = element;
    }

    public Object dequeue() {
        if (isEmpty()) return null;
        if (getSize() == 1) {
            last--;
            return this.queue[this.first--];
        }
        Object tmp = this.queue[this.first];
        IntStream.range(first, last).forEach(i -> this.queue[i] = this.queue[i + 1]);
        last--;
        return tmp;
    }
}
