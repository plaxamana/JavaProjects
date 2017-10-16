package com.laxamana.philip;

/**
 * Created by phili on 9/7/2017.
 */
public class Printer {
    private Toner black;
    private Toner cyan;
    private Toner magenta;
    private Toner yellow;
    private int numOfPages;
    private boolean isDuplex;

    public void checkAllTonerLevels(){
        System.out.println("Black: " + black.getTonerLevel());
        System.out.println("Cyan: " + cyan.getTonerLevel());
        System.out.println("Magenta: " + magenta.getTonerLevel());
        System.out.println("Yellow: " + yellow.getTonerLevel());
    }

    public void refillInk(Toner ink){
        ink.refillToner();
    }

    public void printPages(int pages){
        if(pages > 0){
            System.out.println("Now printing: " + pages + " pages.");
            this.numOfPages -= pages;
        }
        else {
            System.out.println("You cannot print anything if the number is < 0.");
        }

        System.out.println(this.numOfPages + " pages are remaining.");

    }

    public Printer(Toner black, Toner cyan, Toner magenta, Toner yellow, int numOfPages, boolean isDuplex) {
        this.black = black;
        this.cyan = cyan;
        this.magenta = magenta;
        this.yellow = yellow;
        this.numOfPages = numOfPages;
        this.isDuplex = isDuplex;

        System.out.println("Printer is now created.");
    }
}
