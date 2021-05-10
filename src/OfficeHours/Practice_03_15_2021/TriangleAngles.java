package OfficeHours.Practice_03_15_2021;

public class TriangleAngles {
    public static void main(String[] args) {

        /*
        A triangle is valid if the sum of all the three angles is equato 180 degrees.
         */


        int angleOne = 100;
        int angleTwo = 30;
        int angleThree = 50; // scan.nextInt()

        int sum = angleOne + angleTwo + angleThree;
       // boolean check = angleOne + angleTwo + angleThree == 180;-->also we can do as it is too and then only
        // need to do this --> if (check){

        if(sum == 180) { // also we can do as it is -->  if((angleOne + angleTwo + angleThree) == 180) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }

    }
}


