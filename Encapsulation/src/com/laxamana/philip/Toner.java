package com.laxamana.philip;

/**
 * Created by phili on 9/7/2017.
 */
public class Toner {
    private String colour;
    private int tonerLevel;

    public Toner(String colour, int tonerLevel) {
        this.colour = colour;
        if(tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
    }

    public int getTonerLevel(){
        return tonerLevel;
    }

    public void refillToner(){
        if(this.tonerLevel > 0 && this.tonerLevel < 15){
            this.tonerLevel = 100;
        }
        System.out.println("Toner has been refilled to 100%.");
    }
}
