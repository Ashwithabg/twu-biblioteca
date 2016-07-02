package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashwitha on 30/6/16.
 */
public class TestMainMenu {
    @Test
    public void checkDisplayOfNoOptionsInMainMenu(){
        ArrayList<String> listOptions=new ArrayList<String>();
        MainMenu mainMenu = new MainMenu(listOptions);
        assertEquals(mainMenu.displayOptions(),0);
    }
    private MainMenu getMainMenu() {
        ArrayList<String> listOptions=new ArrayList<String>();
        listOptions.add("list books");
        return new MainMenu(listOptions);
    }
    @Test
    public void checkDisplayOfOptionsInMainMenu(){
        MainMenu mainMenu = getMainMenu();
        assertEquals(mainMenu.displayOptions(),1);
    }
    private MainMenu getMainMenuWithTwoOption() {
        ArrayList<String> listOptions=new ArrayList<String>();
        listOptions.add("list books");
        listOptions.add("quit");
        return new MainMenu(listOptions);
    }
    @Test
    public void checkDisplayOfTwoOptionsInMainMenu(){
        MainMenu mainMenu = getMainMenuWithTwoOption();
        assertEquals(mainMenu.displayOptions(),2);
    }
    @Test
    public void checkDisplayOfTwoOptionsInMainMenu1(){
        MainMenu mainMenu = getMainMenuWithTwoOption();
        assertEquals(mainMenu.displayOptions(),2);
    }



}
