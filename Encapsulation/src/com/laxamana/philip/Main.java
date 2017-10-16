package com.laxamana.philip;

public class Main {

    public static void main(String[] args) {

        // Create a class and demonstrate proper encapsulation techniques
        // The class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner level, number of pages printed and,
        // also whether its a duplex printer (capable of printing on both sides)
        // Add methods to fill up the toner (to maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        Toner black = new Toner("Black", 100);
        Toner yellow = new Toner("yellow", 100);
        Toner cyan = new Toner("cyan", 100);
        Toner magenta = new Toner("magenta", 100);

        Printer printer = new Printer(black, cyan, magenta, yellow, 1000, true);

        System.out.println();

        printer.checkAllTonerLevels();

        System.out.println();

        printer.printPages(20);
    }
}
