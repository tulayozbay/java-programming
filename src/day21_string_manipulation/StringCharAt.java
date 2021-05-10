package day21_string_manipulation;

import java.sql.SQLOutput;

public class StringCharAt {
    public static void main(String[] args) {

//                    "0123"
        String word = "java";
        System.out.println(word.charAt(0));//j
        System.out.println(word.charAt(1));//a
        System.out.println(word.charAt(2));//v
        System.out.println(word.charAt(3));//a
      //  System.out.println(word.charAt(4));//it is goping to give an error.
        // we have no index 4
        System.out.println(word.length());//4 --> because length manipulation shows us how many character there.

                    //   "01234567"
        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        System.out.println(company.charAt(1));
        char first =company.charAt(0);
        System.out.println(first);
        char second =company.charAt(1);
        char third =company.charAt(2);
        char fouth =company.charAt(3);
        char fifth =company.charAt(4);
        char sixth =company.charAt(5);
        char seventh =company.charAt(6);
        char eighth =company.charAt(7);
        //C y b e r t e k
        System.out.println(first + " " + second + " " + third + " " + fouth + " " + fifth + " " + sixth + " " + seventh
                           + " " + eighth);

        String withSpaces = first + " " + second + " " + third + " " + fouth + " " + fifth + " " + sixth + " " + seventh
                + " " + eighth;
        System.out.println("withSpaces = " + withSpaces);


    }
}
