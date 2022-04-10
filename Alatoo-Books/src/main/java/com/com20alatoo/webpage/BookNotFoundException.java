package com.com20alatoo.webpage;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Integer id) {
        super("Could not find the book " + id);
    }
}
