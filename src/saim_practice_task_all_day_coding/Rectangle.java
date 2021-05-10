package saim_practice_task_all_day_coding;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the length:");
        double length = scan.nextDouble();
        System.out.println("Enter the width:");
        double width = scan.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
}
