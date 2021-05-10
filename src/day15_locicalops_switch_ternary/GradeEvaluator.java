package day15_locicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';

        //if we want we can put lowercase as buttom. also we can put in paranthesis it is not necessary but easy to read.
        // if ((grade == 'A' || grade == 'a') ||(grade == 'B' || grade == 'b') || (grade == 'C' || grade == 'c')) {

        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println(grade + " - passed");
        } else if (grade == 'D') {
            System.out.println(grade + " - qualify for retake");
        } else if (grade == 'E') {
            System.out.println(grade + " - fail");
        } else {
            System.out.println(grade + " - invalid grade");
        }

    }

}
