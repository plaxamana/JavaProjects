/**
 * Created by phili on 7/13/2017.
 */
public class Main {
    public static void main (String[] args){

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable
        // 3. Print the result

        // NOTE:  1 pound is equal to 0.45359237 kilograms.

        int pounds = 40;
        float kilogramsToPounds = 0.45359237f;

        float conversion = pounds * kilogramsToPounds;

        System.out.printf("40 pounds is equal to %f kilograms.", conversion);
    }
}
