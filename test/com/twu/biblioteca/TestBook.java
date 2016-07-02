package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashwitha on 30/6/16.
 */
public class TestBook {
    @Test
    public void checkGetTitleMethod(){
        Book book =new Book("HJ1","head first java","kathy Sierra",2000);
        assertEquals(book.getTitle(),"head first java");
    }

    @Test
    public void checkGetAuthorMethod(){
        Book book =new Book("HJ1","head first java","kathy Sierra",2000);
        assertEquals(book.getAuthor(),"kathy Sierra");
    }

    @Test
    public void checkGetYearMethod(){
        Book book =new Book("HJ1","head first java","kathy Sierra",2000);
        assertEquals(book.getYear(),2000);
    }

    @Test
    public void checkGetBookIdMethod(){
        Book book =new Book("HJ1","head first java","kathy Sierra",2000);
        assertEquals(book.getBookId(),"HJ1");
    }

    @Test
    public void checkGetBookIdMethodForDifferentBook(){
        Book book =new Book("HJ2","head first java","kathy Sierra",2005);
        assertEquals(book.getBookId(),"HJ2");
    }
}
