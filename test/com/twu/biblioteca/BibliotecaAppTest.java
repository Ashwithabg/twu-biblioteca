package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by ashwitha on 29/6/16.
 */
public class BibliotecaAppTest {
    @Test
    public void checkMethodThatdisplayWelcomeMessage(){
        BibliotecaTestDrive bibliotecaTestDrive =new BibliotecaTestDrive();
        assertEquals(bibliotecaTestDrive.getWelcomeMessage(),"Welcome to Bibleoteca");
    }
}
