/**
 * Created by phili on 7/26/2017.
 */
public class VIPCustomer {
    /*
        * Create a new class called VIPCustomer
        * It should have 3 fields; name, credit limit, and email address
        * create 3 constructors
        * 1st constructor empty should call 3 parameters with default values
        * 2nd constructor should pass 2 values it receives and adds a 3rd default
        * 3rd constructor should save all fields
        * create getters only for this code generation of intellij as setters won't be needed
        * test and confirm it works
        *
    */

    private String name;
    private String emailAddress;
    private int creditLimit;

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public VIPCustomer(){
        this("Joe", "joe@gmail.com", 1000);
    }

    public VIPCustomer(String emailAddress, int creditLimit){
        this("defaultName", emailAddress, creditLimit);
    }

    public VIPCustomer(String name, String emailAddress, int creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }
}
