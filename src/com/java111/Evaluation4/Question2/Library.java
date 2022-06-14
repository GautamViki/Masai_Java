package com.java111.Evaluation4.Question2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {

        boolean bool = bookList.add(book);
        if (bool) {
            System.out.println("Book added successfully");
        } else {
            System.out.println("Book not added");
        }
    }

    public boolean isEmpty() {
        if (bookList.size() > 0) {
            return false;
        }
        return true;
    }

    public List<Book> viewAllBook() {
        return this.bookList;
    }

    public List<Book> viewBookByAuthor(String author) {
        List<Book> bookByAuthor = new ArrayList<>();
        for (Book b : this.bookList) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                bookByAuthor.add(b);
            }
        }
        return bookByAuthor;
    }

    public int countNoOfBook(String bookName) {
        int count = 0;
        for (Book b : this.bookList) {
            if (b.getBookName().equalsIgnoreCase(bookName)) {
                count++;
            }
        }
        return count;
    }
}
