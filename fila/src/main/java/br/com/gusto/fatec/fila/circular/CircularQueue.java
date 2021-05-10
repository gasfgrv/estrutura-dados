package br.com.gusto.fatec.fila.circular;

import lombok.extern.java.Log;

@Log
public class CircularQueue {
    private final Object[] queue;
    private final int size;
    private int rear;
    private int front;

    public CircularQueue(int size) {
        this.size = size;
        queue = new Object[size];
        rear = front = -1;
    }

    public void enqueue(Object element) {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) log.info("Queue Overflow");
        else if (front == -1) {
            front = rear = 0;
            queue[rear] = element;
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
            queue[rear] = element;
        } else {
            rear++;
            queue[rear] = element;
        }
    }

    public Object dequeue() {
        if (front == -1) {
            log.info("Queue Underflow");
            return null;
        }
        var tmp = queue[front];
        queue[front] = null;
        if (front == rear) front = rear = -1;
        else if (front == size - 1) front = 0;
        else front++;
        return tmp;
    }

    public void showQueue() {
        if (front == -1) {
            log.info("Queue is Empty");
            return;
        }

        if (rear >= front) for (var i = front; i <= rear; i++) log.info(String.valueOf(queue[i]));
        else {
            for (var i = front; i < size; i++) log.info(String.valueOf(queue[i]));
            for (var i = 0; i <= rear; i++) log.info(String.valueOf(queue[i]));
        }
    }
}
