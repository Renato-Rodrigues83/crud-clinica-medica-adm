package br.edu.imepac.Administrativo.exceptions;

public class ExceptionDTO {
    private int status;
    private String message;

    public ExceptionDTO(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
