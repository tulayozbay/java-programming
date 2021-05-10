package OfficeHours.Practice_03_10_2021;

import java.util.Scanner;

public class MovieDuration {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the length of the movie");
        double movielength = input.nextDouble();

        // = assignment
        // == compare

        if (movielength == 1) {
            System.out.println("Price = " + 8.99);
        }

        if (movielength ==1.5) {
            System.out.println("Price = " + 10.50);
        }

        if (movielength == 2.0) {
            System.out.println("Price = " + 12.99);
        }

        if (movielength == 2.5) {
            System.out.println("Price = " + 14.50);
        }

        if (movielength >= 3.0) {
            System.out.println("Price = " + 15.99);
        }

    }

}
