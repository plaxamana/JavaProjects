package com.laxamana.philip;

/**
 * Created by philip on 8/14/2017.
 */
public class Car extends Vehicle {

    private int passengerCap;
    private int currentGear;
    private int numOfDoors;
    private boolean isManual;

    public Car(String name, int fuelCap, int passengerCap, int numOfDoors, boolean isManual){
        super(4, name, fuelCap);

        this.passengerCap = passengerCap;
        this.currentGear = 0;
        this.numOfDoors = numOfDoors;
        this.isManual = isManual;
    }

    public void changeGear(int gearSelect){
        if(isManual){
            this.currentGear += gearSelect;
            System.out.println("Car.changeGear() called.");
            System.out.println("Changing to gear #" + currentGear);
        } else {
            System.out.println("Gear will change automatically.");
        }
    }

}
