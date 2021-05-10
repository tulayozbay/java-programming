package day24_loops;

import java.util.Scanner;

public class CountUntill {
    public static void main(String[] args) {
        System.out.println("ENter a number:");
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number to count until: ");
        int numberToStop = scan.nextInt();
        int start = 1;

        while(start <= numberToStop) {
            System.out.print(start+" ");
            start++;
        }
    }
}
