package OfficeHours.Practice_03_30_2021;
import java.util.*;
/*
[Dynamic alphabet]
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or order descending
- Ascending:A–Zora–z
- Descending:Z–A or z–a
 */

public class DynamicLetters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = input.next();
        System.out.println("Do you want it in ascending or descending order");
        String ascendingOrDescending = input.next();
        int starting;
        int ending;

        if (upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';
        } else {

            starting = 'a';
            ending = 'z';
        }

        if (ascendingOrDescending.equals("ascending")) {
            //VERY IMPORTANT TO CAST INT TO CHAR FOR GIVES LETTER NO ASCII TABLE VALUE AS A NUMBER.
            for (int i = starting; i <= ending; i++) {// now  it is dynamic code
                System.out.print((char) i + " ");//we casted it with char . because we sassign with int.
                //if you did not cast it it gives the number . try if you want take it off char.
                //if you take it off char it6 gives like this 65 66 67 ...
                // because a value is on ascii table 65 and b =66 ...
            }
        } else {
            for (int i = ending; i >= starting; i++) {
                System.out.print((char) i + " ");
            }

        }
    }
}
