package practice_java_interview_questions;

import java.util.Scanner;

public class ReserveStringWordByWord {

    /*
       Reverse words. Write a method that will take a string as an argument.
       The method will reverse the position of words and return it.
       ` revWords("apple banana kiwi") -> "kiwi banana apple"
         revWords("I am John Doe")     -> "Doe John am I"
       revWords("orange")            -> "orange"

     */

    public static String reserveSentence (String inputSentence){

        //Split inputSentence into words and store them in a string array.
        String [] words = inputSentence.split("\\s");

        //Create one empty outputString object.+
        String outputSentence = "";

        // Starting from last word of words array, append each word to outputSentence.
        for (int i = words.length-1; i >= 0 ; i--) {

            outputSentence = outputSentence + words[i] + " ";

        }

        return outputSentence;
    }


    public static void main(String[] args) {

        //Create one java.util.Scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter input sentence:");

        //Take inputString from the user.
        String inputSentence = scan.nextLine();

        //call the method which is we created
        String outputSentence = reserveSentence(inputSentence);

        System.out.println("input sentence = " + inputSentence);

        System.out.println("output sentence = " + outputSentence);

        //And close the scanner
        scan.close();

    }


}
