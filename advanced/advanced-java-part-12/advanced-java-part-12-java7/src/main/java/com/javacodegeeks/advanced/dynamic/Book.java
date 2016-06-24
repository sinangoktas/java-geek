package com.javacodegeeks.advanced.dynamic;

public class Book {
    private final String author;
    private final String title;
    
    public Book(final String author, final String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
