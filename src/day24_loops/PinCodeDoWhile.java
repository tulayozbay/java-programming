package day24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int secretPinCode = 1234;
        int pinCode;//bunu buraya yazmaktaki amaci mutlaka anlamalisin izle day 24 son 45 dk icinde goreceksin.
        do {
            System.out.println("Enter pincode");
            pinCode = scan.nextInt();
        } while (pinCode != secretPinCode);
    }
}
