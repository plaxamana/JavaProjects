/**
 * Created by philip on 7/31/2017.
 */
public class Car extends Vehicle{

    private int passengerCap;
    private int doors;
    private boolean isManual;
    private int currentGear;

    public Car(String make, int passengerCap, int doors, boolean isManual) {
        super(make, 4);
        this.passengerCap = passengerCap;
        this.doors = doors;
        this.isManual = isManual;

        this.currentGear = 0;
    }

    public void showInformation(){
        if(isManual){
            System.out.println("This car has Manual Transmission, " + getDoors() +
            " doors, and can carry " + getPassengerCap() + " passengers total.");
        } else {
            System.out.println("This car has Automatic Transmission, " + getDoors() +
                    " doors, and can carry " + getPassengerCap() + " passengers total.");
        }
    }

    public int getPassengerCap() {
        return passengerCap;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public void accelerate(int speed){
        if(isManual){
            if(currentGear == 0 || currentGear < 6){
                currentGear++;
                System.out.println("Shifting into gear: " + currentGear);
                super.accelerate(speed);
            } else {
                System.out.println("cannot up shift.");
            }
        }else {
            super.accelerate(speed);
        }
    }
}
