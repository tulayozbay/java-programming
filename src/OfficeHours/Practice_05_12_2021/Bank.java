package OfficeHours.Practice_05_12_2021;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccountOne = new BankAccount();//this is an abject we create by new keyboard
        bankAccountOne.accountHolderName = "James Bond";
        bankAccountOne.pin = 1234;
        bankAccountOne.balance = 1_000_000;
        bankAccountOne.accountNumber = 21332131;

        System.out.println(bankAccountOne.pin);
        System.out.println(bankAccountOne.getBalance(2234));
        System.out.println();

        System.out.println(new BankAccount().accountHolderName);

        bankAccountOne = new BankAccount();
        System.out.println(bankAccountOne.accountHolderName);

        //NOTES: mhow many new keyboard we have it means we have object too.
        // for example we have till now 3 new keyboard it means we have 3 objects


    }

}
