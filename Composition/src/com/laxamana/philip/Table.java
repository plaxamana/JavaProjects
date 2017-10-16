package com.laxamana.philip;

/**
 * Created by phili on 9/7/2017.
 */
public class Table {
    private String name;
    private String style;
    private int legs;

    public Table(String name, String style, int legs) {
        this.name = name;
        this.style = style;
        this.legs = legs;
    }

    static public void clear(){
        System.out.println("Table is now cleared.");
    }


}
