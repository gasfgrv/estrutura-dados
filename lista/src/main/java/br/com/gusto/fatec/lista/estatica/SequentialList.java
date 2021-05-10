package br.com.gusto.fatec.lista.estatica;

import lombok.extern.java.Log;

@Log
public class SequentialList {
    private final int[] list;
    private int last = -1;

    public SequentialList(int size) {
        list = new int[size];
    }

    public boolean isEmpty() {
        return last == -1;
    }

    public boolean isFull() {
        return last == list.length - 1;
    }

    public int getSize() {
        return last + 1;
    }

    public int get(int index) {
        if (isEmpty()) {
            log.info("Erro, Lista Vazia!");
            return 0;
        }

        if (index < 0 || index > last) {
            log.info("Erro, índice inv�lido");
            return 0;
        }

        return list[index];
    }

    public boolean insert(int element) {
        if (isFull()) return false;
        else {
            last++;
            list[last] = element;
            return true;
        }
    }

    public boolean insert(int index, int element) {
        if (isFull() || index < 0 || index > last + 1) return false;
        else {
            if (last + 1 - index >= 0) System.arraycopy(list, index, list, index + 1, last + 1 - index);
            last++;
            list[index] = element;
            return true;
        }
    }

    public boolean remove(int index) {
        if (isEmpty()) return false;
        if (index < 0 || index > last) return false;
        int numberOfElements = last - index;
        if (numberOfElements > 0) System.arraycopy(list, index + 1, list, index, numberOfElements);
        last--;
        return true;
    }

    public void print() {
        for (var i = 0; i <= last; i++) log.info(String.valueOf(list[i]));
    }
}
