package OfficeHours.Practice_03_15_2021;

public class OperatorAnalyze {
    public static void main(String[] args) {
        /*
        Analyze the following without intellij.
        Calculate the output
         */

        int a = 5; //a = 6 will be this value after bottom process
        int b = a++ + a-- + a * 2 + a + ++a; //b = 32
        //      5   + 6   + 5 * 2 + 5 +   6

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
