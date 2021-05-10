package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;
        double remainingBalance = balance - (price1 + price2 + price3);
//        double remainingBalance = balance - price1 - price2 - price3); we can assign like this too. because left to right;)

        System.out.println("My initial balance is " + balance);
        System.out.println("My remaining balance is " + remainingBalance);

        //Also we can do as it is the bottom

        System.out.println("My initial balance  : $" + balance);
        System.out.println("My remaining balance: $" + remainingBalance);

        int balanceWithNoCents = (int) remainingBalance; // we can converted double to int like this.
        System.out.println("My remaining balance: $" + balanceWithNoCents);
    }
}
