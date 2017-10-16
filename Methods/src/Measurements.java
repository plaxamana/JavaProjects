/**
 * Created by phili on 7/19/2017.
 */
public class Measurements {

    public static void main (String[] args){
        calcFeetAndInchesToCentimeters(12);
        calcFeetAndInchesToCentimeters(4, 11);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if ((feet < 0) || (inches < 0 || inches > 12)){
            return -1;
        }

        double feetToCm = feet * 30.48;
        double inchesToCm = inches * 2.54;

        double total = feetToCm + inchesToCm;
        System.out.println(feet + "ft, " + inches + " inches is equal to " + total + " cm");
        return total;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches < 0){
            return -1;
        }

        double inchesToCm = inches * 2.54;
        System.out.println(inches + " inches is equal to " + inchesToCm + " cm");
        return inchesToCm;
    }
}
