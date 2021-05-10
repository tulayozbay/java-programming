package saim_practice_task_all_day_coding;

import java.util.Scanner;

/**
 * [Triangle - If statement, operators]
 *
 * A triangle is valid if the sum of all the three angles is equal to 180 degrees.
 * Write a program that declares three integers as angles and check whether the triangle is valid or not.
 * Print "Valid triangle" or "Not a valid triangle".
 *
 *     => To make it dynamic change the three angles to be Scanner inputs
 */

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first angle: ");
        int firstAngle = input.nextInt();
        System.out.println("Enter second angle: ");
        int secondAngle = input.nextInt();
        System.out.println("Enter third angle: ");
        int thirdAngle = input.nextInt();
        int triangle = firstAngle + secondAngle + thirdAngle;

        if (triangle == 180) {
            System.out.println("valid triangle");
        } else {
            System.out.println("Not valid triangle");
        }

    }
}
