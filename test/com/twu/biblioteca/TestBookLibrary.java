package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashwitha on 30/6/16.
 */
public class TestBookLibrary {
    @Test
    public void checkListOfBooksContaingOneBook() {
        ArrayList<Book> books =new ArrayList<Book>();
        books.add(new Book("HJ1","head firat java","kathy Sierra",2000));
        BookLibrary bookLibrary = new BookLibrary(books);
        assertEquals(bookLibrary.getNumberOfBooksInLibrary(),1);
    }
    @Test
    public void checkListOfBooksWithTwoBooks() {
        BookLibrary bookLibrary = getBookLister();
        assertEquals(bookLibrary.getNumberOfBooksInLibrary(),2);
    }

    @Test
    public void CheckTheMethodForCheckOutOptionforTrueCondition(){
        BookLibrary bookLibrary = getBookLister();
        assertEquals(bookLibrary.isTheDesiredBookAvailable("HJ1"),true);
    }
    @Test
    public void checkTheMethodCheckOutOptionforFalseCondition(){
        BookLibrary bookLibrary = getBookLister();
        assertEquals(bookLibrary.isTheDesiredBookAvailable("HJ2"),false);
    }
    @Test
    public void checkTheMethodReturnedBookTrueCondition(){
        BookLibrary bookLibrary = getBookLister();
        bookLibrary.isTheDesiredBookAvailable("HJ1");
        assertEquals(bookLibrary.returnedBookValidityCheck("HJ1"),true);
    }
    @Test
    public void checkTheMethodReturnedBookFalseCondition(){
        BookLibrary bookLibrary = getBookLister();
        bookLibrary.isTheDesiredBookAvailable("HJ1");
        assertEquals(bookLibrary.returnedBookValidityCheck("HJ2"),false);
    }

    private BookLibrary getBookLister() {
        ArrayList<Book> books =new ArrayList<Book>();
        books.add(new Book("HJ1","head firat java","kathy Sierra",2000));
        books.add(new Book("CJ1","core java","Nagaraj",2003));
        return new BookLibrary(books);
    }
    @Test
    public void checkTheMethodCheckOutBooksWithReturnBookForTrueCondition(){
        BookLibrary bookLibrary = getBookLister();
        bookLibrary.isTheDesiredBookAvailable("HJ1");
        bookLibrary.isTheDesiredBookAvailable("CJ1");
        assertEquals(bookLibrary.returnedBookValidityCheck("HJ1"),true);
    }
    @Test
    public void checkTheMethodCheckOutBooksWithReturnBookForFalseCondition(){
        BookLibrary bookLibrary = getBookLister();
        bookLibrary.isTheDesiredBookAvailable("HJ1");
        bookLibrary.isTheDesiredBookAvailable("CJ1");
        assertEquals(bookLibrary.returnedBookValidityCheck("CJ2"),false);
    }

    @Test
    public void checkTheMethodCheckOutBookWithReturnBooksForFalseCondition(){
        BookLibrary bookLibrary = getBookLister();
        bookLibrary.isTheDesiredBookAvailable("HJ1");
        bookLibrary.returnedBookValidityCheck("HJ1");
        assertEquals(bookLibrary.returnedBookValidityCheck("HJ1"),false);
    }

    @Test
    public void checkTheMethodCheckOutBooksWithReturnBooksForFalseCondition(){
        BookLibrary bookLibrary = getBookLister();
        bookLibrary.isTheDesiredBookAvailable("CJ1");
        assertEquals(bookLibrary.isTheDesiredBookAvailable("CJ1"),false);
    }
    @Test
    public void checkTheMethodThreeCheckOutBookWithTwoReturnBookForTrueCondition(){
        BookLibrary bookLibrary = getBookLister();
        bookLibrary.isTheDesiredBookAvailable("HJ1");
        bookLibrary.returnedBookValidityCheck("HJ1");
        bookLibrary.isTheDesiredBookAvailable("CJ1");
        bookLibrary.returnedBookValidityCheck("CJ1");
        assertEquals(bookLibrary.isTheDesiredBookAvailable("HJ1"),true);
    }
    @Test
    public void checkTheMethodThreeCheckOutBookWithOneReturnBookForTrueCondition(){
        BookLibrary bookLibrary = getBookLister();
        bookLibrary.isTheDesiredBookAvailable("HJ1");
        bookLibrary.returnedBookValidityCheck("HJ1");
        bookLibrary.isTheDesiredBookAvailable("HJ1");
        assertEquals(bookLibrary.isTheDesiredBookAvailable("HJ1"),false);
    }


}
