package com.twu.biblioteca;

/**
 * Created by ashwitha on 30/6/16.
 */
public class Book {
    private String bookId;
    private String title;
    private String author;
    private int year;

    public Book(String bookId, String title, String author, int year) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {

        return author;
    }

    public int getYear() {
        return year;
    }

    public String getBookId() {
        return bookId;
    }
}
