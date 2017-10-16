/**
 * Created by philip on 7/29/2017.
 */
public class Vehicle {
    private String make;
    private int wheels;
    private int currentDirection;
    private int currentVelocity;
    private boolean isEngineOff;

    public Vehicle(String make, int wheels) {
        this.make = make;
        this.wheels = wheels;

        this.currentDirection = 0;
        this.currentVelocity = 0;
        this.isEngineOff = true;
    }

    public void steer(int direction){
        if(isEngineOff) {
            System.out.println("You can't move the car while the engine is off!");
        }else {
            this.currentDirection += direction;
            System.out.println("Steering at " + currentDirection + " degrees.");
        }
    }

    public void move(int speed, int direction){
        if(isEngineOff) {
            System.out.println("You can't move the car while the engine is off!");
        }else {
            this.currentVelocity += speed;
            this.currentDirection += direction;
            System.out.println("Moving at " + currentVelocity + " mph in the direction of " + currentDirection + " degrees.");
        }
    }

    public void accelerate(int speed){
        if(isEngineOff){
            System.out.println("You can't move the car while the engine is off!");
        }else {
            this.currentVelocity += speed;
            System.out.println("Moving at " + currentVelocity + " mph");
        }
    }

    public void startEngine(){
        if(isEngineOff){
            isEngineOff = false;
            System.out.println("Starting engine... ");
        }
    }

    public void turnOffEngine(){
        if(!isEngineOff){
            isEngineOff = true;
            System.out.println("Shutting down engine... ");
        }
    }
}
