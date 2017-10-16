package com.laxamana.philip;

/**
 * Created by philip on 8/14/2017.
 */
public class Vehicle {

    private int wheels;
    private String name;
    private int fuelCap;


    private int currentSpeed;
    private int currentDirection;

    Vehicle (int wheels, String name, int fuelCap){
        this.wheels = wheels;
        this.name = name;
        this.fuelCap = fuelCap;

        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void decelerate(int speed){
        this.currentSpeed -= speed;
        System.out.println("Vehicle.decelerate() called");
        System.out.println("Vehicle moving at " + currentSpeed + " mph.");
    }

    public void accelerate(int speed){
        this.currentSpeed += speed;
        System.out.println("Vehicle.accelerate() called.");
        System.out.println("Vehicle moving at " + currentSpeed + " mph.");
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() called.");
        System.out.println("Vehicle steering at " + currentDirection + " degrees.");
    }

    public void move(int speed, int direction){
        this.currentSpeed += speed;
        this.currentDirection += direction;
        System.out.println("Vehicle.move() called.  ");
        System.out.println("Vehicle moving at " + currentSpeed + " mph in the direction of " + currentDirection);
    }
}
