package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by ashwitha on 30/6/16.
 */
public class MainMenu {
    private ArrayList<String> listOptions;


    public MainMenu(ArrayList<String> listOptions) {
        this.listOptions = listOptions;
    }

    public int displayOptions() {
        for(String options:listOptions){
            System.out.println(options);
        }
        return  listOptions.size();
    }

    public void selectTheOption() {
        displayOptions();
        callSwitchCases();
    }

    private void callSwitchCases() {
        switch (getUserOption()){
            case 1:displayBookOptions();
                break;
            case 2:exit(1);
            default:
                System.out.println(printErrorMessage());
                break;
        }
    }

    private void displayBookOptions() {
        BookLibrary bookLibrary =new BookLibrary(makeBookList());
        bookLibrary.bookOptions();
    }

    private String printErrorMessage() {
        return "invalid input!!!Try once again";
    }

    public int getUserOption(){
        System.out.println("enter the option");
        Scanner scanner=new Scanner(System.in);
        return   scanner.nextInt();
    }
    private static ArrayList<Book> makeBookList() {
        ArrayList<Book> books =new ArrayList<Book>();
        books.add(new Book("HJ1","head first java","kathy Sierra",2000));
        return books;
    }

}
