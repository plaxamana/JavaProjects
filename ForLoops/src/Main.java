/**
 * Created by philip on 7/25/2017.
 */
public class Main {

    public static void main (String[] args){

        int number = 10;


//        for(int i = 2; i < 8; i++){
//            double x = calculateInterest(10000, i);
//            System.out.printf("10,000 at %d%%: %.2f\n", i, x);
//        }
//
//        System.out.printf("%n");
//
//        for(int i = 8; i > 1; i--){
//            double x = calculateInterest(10000, i);
//            System.out.printf("10,000 at %d%%: %.2f\n", i, x);
//        }
//
//        System.out.printf("%n");
//
//        int count = 0;
//        for(int i = 100; i <= 200; i++){
//            if (isPrime(i) == true){
//                System.out.printf("%d is a prime number\n", i);
//                count++;
//                if (count == 3){
//                    System.out.println("Exiting for loop");
//                    break;
//                }
//            }
//        }
//
//        System.out.println(count + " prime numbers");
    }

    public static boolean isEvenNumber(int n){
        if ((n % 2) == 0){
            return true;
        }
        return false;
    }
//    public static double calculateInterest(double amount, double interest){
//        return(amount *(interest/100));
//    }
//
//    public static boolean isPrime (int n){
//        if (n == 1){
//            return false;
//        }
//
//        for (int i = 2; i <= n/2; i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//
//        return true;
//    }
}

