/**
 * Created by phili on 7/26/2017.
 */
public class Account {
    // create account number, balance, customer name, email and phone number

    private String acctNum;
    private double balance;
    private String name;
    private String email;
    private String phoneNum;

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void depositMoney(double amount){
        if (amount > 0){
            System.out.println("Depositing: " + amount);
            balance += amount;
        } else {
            System.out.println("Amount cannot be 0 or negative.");
        }
    }

    public double withdrawMoney(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds, cannot withdraw " + amount);
            return -1;
        } else {
            System.out.println("Withdrawing: " + amount);
            balance -= amount;
            return amount;
        }
    }

}
