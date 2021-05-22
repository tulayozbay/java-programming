package day46_encapsulation;

public class CheckingAccount {

    //create  encapsulated data
    private double balance;
    private long accountNumber;
    private String accountHolder;
    private String accountType = "checking";//default is checking, we can change if needed using setter

    /**
     * Ev odevi
     * public void setAccountInfo (long accountNumber, accountHolder, double balance, String accountType)
     * 1)this.accountNumber = accountNumber
     * 2)setAccountNumber(accountNumber);
     */

    //easy way to get getter and setter
    //right click + generate + Getter and Setter + select all(shift + click byoneby) + OK


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;


    }
}
