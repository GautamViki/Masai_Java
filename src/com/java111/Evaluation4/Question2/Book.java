package com.java111.Evaluation4.Question2;

public class Book {
    private int isbn;
    private String bookName;
    private String author;

    public Book(String name, String author) {
        this.bookName = name;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
}
