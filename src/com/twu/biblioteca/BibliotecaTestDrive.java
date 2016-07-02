package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaTestDrive {

    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        callMainMenu();
    }
    public static String getWelcomeMessage() {
        return "Welcome to Bibleoteca";
    }
    private static void callMainMenu() {
        MainMenu mainMenu=new MainMenu(makeListDetails());
        mainMenu.selectTheOption();
    }
    private static ArrayList<String> makeListDetails() {
        ArrayList<String> listOptions=new ArrayList<String>();
        listOptions.add("list Book--->press 1");
        listOptions.add("lQuit--->press 2");
        return listOptions;
    }
}
