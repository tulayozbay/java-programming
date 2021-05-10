package day08_casting_scanner;

import java.util.Scanner; //import meaning is bring it.

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String firstName = scan.next();//waiting for us to type something for input as google.

        System.out.println("Mice to meet you, " + firstName);

    }
}
