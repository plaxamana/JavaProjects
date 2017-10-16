/**
 * Created by phili on 7/26/2017.
 */
public class Main {

    public static void main (String[] args){
        /*Create a new class account
        * Create fields for the account number, balance, customer name, email and phone number
        *
        * Create setters and getters for each field
        * Create 2 additional methods.
        * 1.  To allow the customer to deposit funds (this should increment the balance field
        * 2.  To allow the customer to withdraw funds (this should decrement the balance field,
        * but not allow the withdrawal to be completed if there are insufficient funds.
        * You will want to create various code in the Main class to confirm your code is working
        * Add some System.out.println's in the two methods above as well.
        */

//        Account acc1 = new Account();
//
//        acc1.setAcctNum("123456789");
//        acc1.setName("Richie");
//        acc1.setBalance(5000);
//        acc1.setEmail("rachetboy@gmail.com");
//        acc1.setPhoneNum("4168083214");
//
//        System.out.println("Account no.\t Customer Name\t Balance\t Email\t\t\t\t\t Phone");
//        System.out.println(acc1.getAcctNum()+"\t\t"+acc1.getName()+"\t\t"+acc1.getBalance()+"\t\t"
//                            + acc1.getEmail()+"\t\t"+acc1.getPhoneNum());
//
//        System.out.println();
//
//        acc1.depositMoney(0);
//        System.out.println("Richie now has: " + acc1.getBalance());
//        acc1.withdrawMoney(20000);

        /*
        * Create a new class called VIPCustomer
        * It should have 3 fields; name, credit limit, and email address
        * create 3 constructors
        * 1st constructor empty should call 3 parameters with default values
        * 2nd constructor should pass 2 values it receives and adds a 3rd default
        * 3rd constructor should save all fields
        * create getters only for this code generation of intellij as setters won't be needed
        * test and confirm it works
        * */

        VIPCustomer v1 = new VIPCustomer();
        System.out.println("Default name: " + v1.getName() + " Default email: " + v1.getEmailAddress()
                + " Default credit limit: " + v1.getCreditLimit());
        VIPCustomer v2 = new VIPCustomer("insane@gmail.com", 5000);
        System.out.println();
        System.out.println("Default name: " + v2.getName() + " Default email: " + v2.getEmailAddress()
                + " Default credit limit: " + v2.getCreditLimit());
        VIPCustomer v3 = new VIPCustomer("Nathaniel", "natcabios@gmail.com", 10000);
        System.out.println();
        System.out.println("Default name: " + v3.getName() + " Default email: " + v3.getEmailAddress()
                + " Default credit limit: " + v3.getCreditLimit());
    }
}
