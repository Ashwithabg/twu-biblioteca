package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by ashwitha on 30/6/16.
 */
public class BookLibrary {
    private ArrayList<Book> books =new ArrayList<Book>();
    ArrayList<Book> checkOutBookLister =new ArrayList<Book>();
    private boolean isBookAvailable=false;
    private boolean isCorrectBookReturned=false;

    public BookLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void bookOptions() {
        while(true){
            displayBookOptionsList();
            switch(getUserIntegerInput()){
                case 1:displayBooks();
                    break;
                case 2:checkOut();
                    break;
                case 3:returnBook();
                    break;
                case 4:exit(0);
                    break;
                default:printErrorMessage("invalid option");

            }
        }
    }

    private void displayBookOptionsList() {
        System.out.println("list the books---->press 1\n checkout books---->2\n return books----->3 quit---->4");
    }

    private int getUserIntegerInput()  {
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }


    public void displayBooks() {
        for (Book eachBook : books) {
            printMessage(eachBook.getTitle()+"\t "+ eachBook.getAuthor()+"\t"+ eachBook.getYear());
        }
    }

    public int getNumberOfBooksInLibrary() {
        return books.size();
    }

    public void checkOut() {
        System.out.println("enter the bookid");
        if(isTheDesiredBookAvailable(getUserInputStream()))
            printMessage("thank You!!!!Enjoy The Book");
        else
            printErrorMessage("sorry!!books not available");
    }

    public String getUserInputStream() {
        Scanner scanner=new Scanner(System.in);
        return scanner.next();
    }

    public boolean isTheDesiredBookAvailable(String userInput) {
        isBookAvailable=false;
        for (Book eachBook : books) {
            if(eachBook.getBookId().equals(userInput)){
                doRequiredStepForCheckOut(eachBook);
                break;
            }
        }
        return isBookAvailable;
    }

    public void doRequiredStepForCheckOut(Book eachBook) {
        isBookAvailable=true;
        addBookToListOfCheckedBook(eachBook);
        RemoveBookFromList(eachBook);
    }


    private void RemoveBookFromList(Book eachBook) {
        books.remove(eachBook);
    }

    private void addBookToListOfCheckedBook(Book eachBook) {
        checkOutBookLister.add(new Book(eachBook.getBookId(), eachBook.getTitle(), eachBook.getAuthor(), eachBook.getYear()));
    }

    private void returnBook() {
        System.out.println("enter the bookId");
        if(returnedBookValidityCheck(getUserInputStream()))
            printMessage("books returned");
        else
            printErrorMessage("wrong books!!!return proper books");
    }

    public boolean returnedBookValidityCheck(String userInput) {
        isCorrectBookReturned=false;
        for(Book eachBook : checkOutBookLister)
            if(userInput.equals(eachBook.getBookId())){
                doRequiredStepsForReturningBook(eachBook);
                break;
            }
       return isCorrectBookReturned;
    }

    public void doRequiredStepsForReturningBook(Book eachBook) {
        isCorrectBookReturned=true;
        RemoveBookFromCheckedBookList(eachBook);
        AddBookToList(eachBook);
    }


    private void RemoveBookFromCheckedBookList(Book eachBook) {
        checkOutBookLister.remove(eachBook);
    }
    private void AddBookToList(Book eachBook) {
        books.add(new Book(eachBook.getBookId(), eachBook.getTitle(), eachBook.getAuthor(), eachBook.getYear()));
    }
    private void printErrorMessage(String x) {
        System.out.println(x);
    }

    private void printMessage(String x) {
        System.out.println(x);
    }

}
