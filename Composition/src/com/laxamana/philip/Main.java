package com.laxamana.philip;

public class Main {

    public static void main(String[] args) {
	/*
	* Create a single room of a house using composition
	* Think about the things that should be included in the room
	* Maybe the physical parts of the house but furniture as well
	* Add at least one method to access an object via a getter and
	* then that objects public method
	* then add at least one method to hide the object e.g. not using a getter
	* but to access the object used in composition within the main class
	* */

	    Wall wall1 = new Wall("North", "Red");
        Wall wall2 = new Wall("South", "Red");
        Wall wall3 = new Wall("East", "Red");
        Wall wall4 = new Wall("West", "Red");

        Ceiling ceiling = new Ceiling(20, "white");

        Table coffeeTable = new Table("Coffee", "wooden", 4);

        Furniture sofa = new Furniture("Sofa", 4, 5, "leather");

        Room livingRoom = new Room("Living Room", wall1, wall2, wall3, wall4, ceiling, coffeeTable, sofa);
        livingRoom.ClearTable();
    }
}
