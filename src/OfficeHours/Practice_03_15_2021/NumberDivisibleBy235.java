package OfficeHours.Practice_03_15_2021;

public class NumberDivisibleBy235 {
    public static void main(String[] args) {

       /*
        Create a program that will accept a number and it will print if it is evenly divisible by 2, 3,
        */

        int number = 65;
        boolean by2 = number % 2 == 0; //false
        boolean by3 = number %3 == 0; //false
        boolean by5 = number % 5 == 0; //true

        System.out.println(number + " is divisible by 2: " + by2);
        System.out.println(number + " is divisible by 2: " + by3);
        System.out.println(number + " is divisible by 2: " + by5);
    }
}
