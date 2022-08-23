package day42_Exceptions;

import day31_Constructor.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {
        throw new NoSuchElementException("There is no such an element");

        //throw new InterruptedException();

        //System.out.println("Hello World");

       // throw  new Rectangle(5,7);

    }
}
