package br.com.gusto.fatec.fila.deque;

import lombok.extern.java.Log;

@Log
public class Deque {
    private final Object[] queue;
    private final int size;
    private int front;
    private int rear;

    public Deque(int size) {
        this.size = size;
        queue = new Object[size];
        front = -1;
        rear = 0;
    }

    public boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public void enqueueFront(Object element) {
        if (isFull()) {
            log.info("Queue Overflow");
            return;
        } else if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (front == 0) front = size - 1;
        else front -= 1;

        queue[front] = element;
    }

    public void enqueueRear(Object element) {
        if (isFull()) {
            log.info("Queue Overflow");
            return;
        } else if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1) rear = 0;
        else rear += 1;
        queue[rear] = element;
    }

    public Object deleteFront() {
        Object tmp = getFront();
        if (isEmpty()) {
            log.info("Queue Underflow");
            return null;
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) front = 0;
        else front += 1;
        return tmp;
    }

    public Object deleteRear() {
        Object tmp = getRear();
        if (isEmpty()) {
            log.info("Queue Underflow");
            return null;
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) rear = size - 1;
        else rear -= 1;
        return tmp;
    }

    public Object getFront() {
        if (isEmpty()) return null;
        return queue[front];
    }

    public Object getRear() {
        if (isEmpty() || rear < 0) return null;
        return queue[rear];
    }

    public void showQueue() {
        for (Object o : queue) log.info(String.valueOf(o));
    }
}
