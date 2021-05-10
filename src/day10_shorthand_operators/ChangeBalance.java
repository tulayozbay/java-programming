package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1200.44;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        //*****decrease balance by baklava price*****
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kunafa = 44.45;
        System.out.println("kunafa = " + kunafa);
        balance = balance - kunafa;
        System.out.println("balance after kunafa = " + balance);

        //second kunafa is 50% off. lets buy it
        kunafa = kunafa / 2;
        System.out.println("kunafa = " + kunafa);
        balance = balance - kunafa;
        System.out.println("balance after second kunafa = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        //buy 4 iced teas and decrease balance
        balance = balance - (icedTea * 4);
        System.out.println("balance after 4 iced teas = $" + balance);

        //return baklava
        System.out.println("returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + balance);

    }
}
