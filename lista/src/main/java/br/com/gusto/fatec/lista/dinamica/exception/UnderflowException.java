package br.com.gusto.fatec.lista.dinamica.exception;

public class UnderflowException extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Underflow";
    }
}
