package day09_scanner_practice;

import java.util.Scanner;

public class SpeedcheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);//1st variable
        System.out.println("Your current speed is:");
        int currentSpeed = scan.nextInt();//2nd variable
        int speedLimit = 55;//3rd variable
        int overTheLimit = currentSpeed - speedLimit;//4th variable
        System.out.println("You Re driving " + overTheLimit + " mph over the limit.Slow down!");
    }
}
