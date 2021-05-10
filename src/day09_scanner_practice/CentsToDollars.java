package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents:");
//        int cents = scan.nextInt();
        int cents = 255;// that means HARD CODING-> int cents :255
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("cents = " + cents);//soutv deyip bunu yapabilirsin kisa yolla.
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        // in 123 cents : 1 dollars and 23 cents
        System.out.println("In " + cents + " cents : "+ dollars + " dollars " + remainingCents + " cents.");//concetanation very important

    }
}
