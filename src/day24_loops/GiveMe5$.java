package day24_loops;

import java.util.Scanner;//

public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollars");
        int dollars = scan.nextInt();

        while (dollars != 5){
            System.out.println("Give me 5 dollars" );
            dollars = scan.nextInt();//for keep asking
        }
        System.out.println("Thank you for 5 dollars");



    }
}
