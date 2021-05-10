package saim_practice_task_all_day_coding;

import java.util.Scanner;

public class BooleanPractice {
    public static void main(String[] args) {
        /*
        Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5

Ex:
number = 65

Output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true

         */

        int number = 85;
        if(number % 2 == 0){
            System.out.println(number+" is divisible by 2 : " + (number % 2 == 0) );
            System.out.println(number+" is divisible by 3 : " + (number % 3 == 0));
            System.out.println(number+" is divisible by 5 : " + (number % 5 == 0));
        } if (number % 3 == 0){
            System.out.println(number+" is divisible by 2 : " + (number % 2 == 0) );
            System.out.println(number+" is divisible by 3 : " + (number % 3 == 0));
            System.out.println(number+" is divisible by 5 : " + (number % 5 == 0));
        } if (number % 5 == 0){
            System.out.println(number+" is divisible by 2 : " + (number % 2 == 0) );
            System.out.println(number+" is divisible by 3 : " + (number % 3 == 0));
            System.out.println(number+" is divisible by 5 : " + (number % 5 == 0));
        }

        //yukaridakini yapmanin ikinci yolu
        int number2 = 65;
        boolean by2 = number2 % 2 == 0;
        boolean by3 = number2 % 3 == 0;
        boolean by5 = number2 % 5 == 0;

        System.out.println(number2 + " is divisible by 2: " + by2);
        System.out.println(number2 + " is divisible by 3: " + by3);
        System.out.println(number2 + " is divisible by 5: " + by5);

        /*
        [If statement, operators]

Write a java program that can identify if a person is eligible to vote for the president. Age of voting: 18. Print "Eligible to vote" or "not eligible to vote".

    => To make it dynamic change the three angles to be Scanner inputs
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age:");
        int voteAge = input.nextInt();

        if (voteAge >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        /*
        Write a program that will accept a boolean value. Print out the opposite of the given boolean

Ex: true -> false
    false -> true
         */
        // This one doesn't need if statement
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a boolean");
        boolean bool = scan.nextBoolean();
        System.out.println("The opposite of true is " + !bool);

        // With if statement:

//        if(bool) {
//            System.out.println("The opposite of true is " + false);
//        } else {
//            System.out.println("The opposite of false is " + true);
//        }



    }
}
