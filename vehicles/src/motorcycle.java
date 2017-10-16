/**
 * Created by phili on 7/18/2017.
 */
public class motorcycle {
    String color;
    String make;
    Boolean engineState;

    void startEngine(){
        if (engineState == true)
            System.out.println("Engine is already on.");
        else
            engineState = true;
            System.out.println("Engine is on.");
    }

    void showAttributes() {
        System.out.printf("This motorcycle is a %s %s\n", color, make);
        if (engineState == true)
            System.out.println("The engine is on.");
        else
            System.out.println("The engine is off.");
    }

    public static void main (String[] args){
        motorcycle m = new motorcycle();
        motorcycle viv = new motorcycle();

        viv.color = "yellow";
        viv.make = "china";
        viv.engineState = false;

        m.color = "red";
        m.make = "honda";
        m.engineState = true;

        viv.showAttributes();
        System.out.println();
        m.showAttributes();
    }
}
