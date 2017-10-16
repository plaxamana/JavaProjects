package com.laxamana.philip;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

//    public String getName(){
//        return name;
//    }
//
//    public int getCylinders() {
//        return cylinders;
//    }

    public void startEngine(){
        System.out.println("Engine is now starting");
    }

    public void accelerate(int speed){
        System.out.println("Accelerating to: " + speed + " km/h");
    }

    public void brake(){
        System.out.println("Vehicle is now stopping");
    }
}

class CivicSi extends Car{

    public CivicSi(){
        super("Honda Civic Si", 4);
    }

    public void startEngine(){
        System.out.println("VROOOOOM.  Civic Si now starting.");
    }

    public void accelerate(int speed){
        System.out.println("Now travelling: " + speed + " km/h");
    }

    public void brake(){
        System.out.println("Civic Si now coming to a stop");
    }
}

class BMWCar extends Car {

    public BMWCar() {
        super("335i BMW", 4);
    }

    public void startEngine(){
        System.out.println("Hello.  Your BMW is now starting.");
    }

    public void accelerate(int speed){
        System.out.println("Changing speed to: " + speed + " km/h");
    }

    public void brake(){
        System.out.println("BMW now coming to a complete stop");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("unknown", 8);
        car.startEngine();
        car.accelerate(60);
        car.brake();

        System.out.println();

        Car bmw = new BMWCar();
        bmw.startEngine();
        bmw.accelerate(100);
        bmw.brake();

        System.out.println();

        Car si = new CivicSi();
        si.startEngine();
        si.accelerate(200);
        si.brake();
    }

}
