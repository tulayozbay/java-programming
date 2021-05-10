package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

/*
[Creating an email]
Ask user to enter two strings. Both of these strings should be at least 6 character long. If they
are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and
combine them with the last three characters of the second string. At the end of your combined
string add “@cybertek.com” and print the final string as your created email. The final email
should be in all lowercase.
input:
JamesBond
Secret
output:
jameret@cybertek.com
 */

public class CreateEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words");
        String wordOne = input.nextLine();
        String wordTwo = input.nextLine();
        String email = "";

        if (wordOne.length() >= 6 && wordTwo.length() >= 6) {
            email = wordOne.substring(0, 4);//james--> s is not included because we sign hardcode to 4-->s is 4th one.
            email += wordOne.substring(wordTwo.length()-3);//secret-->it going to start with r because we put -3
            email += "@cybertek.com";
            System.out.println(email);
        } else {
            System.out.println("invalid data");
        }

    }
}
