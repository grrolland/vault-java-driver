package io.github.jopenlibs.vault.rest;

public class RestException extends Exception {

    RestException(final String message) {
        super(message);
    }

    RestException(final Throwable t) {
        super(t);
    }

}
