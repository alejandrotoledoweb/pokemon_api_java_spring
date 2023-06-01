package com.pokemonreview.api.exceptions;

public class ReviewNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 2L;

    public ReviewNotFoundException(String message) {
        super(message);

    }
}
