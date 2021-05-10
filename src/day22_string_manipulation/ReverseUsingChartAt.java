package day22_string_manipulation;

import java.lang.*;//we don't have to import it is going to come automatically/default

public class ReverseUsingChartAt {
    public static void main(String[] args) {
           // output: avaj ---> we can use print instead of println
        String word = "java";//buraya "anna"yazip dene o bir palindrom kelime
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));//--> we put println the last one because after that we want to print next line.
        System.out.println(word);

        //print using single statement and concat +
        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));//IMPORTANT
        //EGER BU "" KOYMAZSAK RAKAMI PRINT YAPIYOR.

        String reversed = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0); //also we assign as is
        //we reserved as is
        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome word");//palindrome word is tersinden de okunuca ayni olan kelimeler
        } else {
            System.out.println("not palindrome word");
        }




    }

}
