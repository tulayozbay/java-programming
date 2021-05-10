package saim_practice_task_all_day_coding;

public class LeapYear {
    public static void main(String[] args) {
        /*
        leap year = there is 366 days in a year instead of 365 days
        [If statements, operators]

        Create a program that will accept a year. Check if the year is a leap year.
        If it is a leap year print "$year is a leap year" otherwise print "$year is not a leap year"

        Hint: Lets say if a number is evenly divisible by 4 it is a leap year
         */

        int year = 2021;
        if (year % 4 == 0){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
