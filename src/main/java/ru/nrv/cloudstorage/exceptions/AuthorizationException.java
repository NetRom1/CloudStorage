package ru.nrv.cloudstorage.exceptions;

public class AuthorizationException extends RuntimeException {
    public AuthorizationException() {
        super("User is not authorized");
    }
}