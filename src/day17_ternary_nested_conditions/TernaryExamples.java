package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {

        //WITH IF STATEMENT
        /*

         */

        int score = 65;

        String result = (score > 60) ? "pass" : "fail";
        System.out.println("result = " + result);

        String quality= "good";

        int rating = (quality.equals ("good")) ? 100 : 0;

        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

        String evenOdd = (score % 2 == 0) ? "even" : "odd";
        System.out.println("evenOdd = " + evenOdd);


    }
}
