package day14_multi_branch_if_stateents;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 number");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println("Enter operator: -, +, *, /");

        char operator = scan.next().charAt(0);// WE CAN USE STRING INSTEAD OF THIS.BUT THIS IS ONLY WAY TO USE CHAR.

        if(operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("invalid operator");

        }

    }
}
