package br.com.gusto.fatec.fila.dinamica.exception;

public class EmptyQueueException extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Empty Queue!";
    }
}
