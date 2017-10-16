/**
 * Created by phili on 7/13/2017.
 */
public class HelloWorld {
    public static void main(String[] args){
        /*
        * 1. Create a byte variable and set it to any valid byte number
        * 2. Create a short variable and set it to any valid short number.
        * 3. Create a int variable and set it to any valid int number.
        * 4. Create a variable of type long, and make it equal to
        * 50000 + 10 times the sum of the byte, plus the short plus the int
        *
        * REVIEW:
        * int = +/- 2^31
        * byte = +/- 2^7
        * short = +/- 2^15
        * long = +/- 2^63
        * */

        byte myByteValue = 127;
        short myShortValue = 32_767;
        int myIntValue = 69_0000;
        long myLongValue = 50_000 + 10 * (myByteValue + myShortValue + myIntValue);

        System.out.println(myLongValue);

        System.out.println("Hello World!");
    }
}
