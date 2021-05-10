package OfficeHours.Practice_03_15_2021;

public class operatorAnalyze2 {
    public static void main(String[] args) {

        /*
           Analyze all section and find value of b
         */
        int a = 200; // a = 199
        int b = -a++ + - --a * a-- % 2 + a;
        //      -200 + - 200 * 200 % 2 + 199
        //      -200 + - 40000 % 2 + 199
        //      -200 + - 0 + 199
        //       -1

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
