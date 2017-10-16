package com.laxamana.philip;

/**
 * Created by phili on 9/7/2017.
 */
public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Table coffeeTable;
    private Furniture sofa;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Table coffeeTable, Furniture sofa) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.coffeeTable = coffeeTable;
        this.sofa = sofa;
    }

    public void ClearTable(){
        System.out.println("Now clearing table.");
        Table.clear();
    }
}
