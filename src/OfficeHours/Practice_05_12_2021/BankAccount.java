package OfficeHours.Practice_05_12_2021;

public class BankAccount {
    //instance variable
    String accountHolderName;//null by default//This String related to BankAccount class
    int pin;
    double balance;
    long accountNumber;
    //till now We have here 3 instance variables we have no object BankAccount.

    public double getBalance(int inputPin){//in order to getBlance we need a pin
        if(pin == inputPin){
            return balance;
        }
        return -1;
    }

}