package OfficeHours.Practice_03_03_2021;
/*
Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
 */
public class Stage1Calculator {
    public static void main(String[] args) {

        double numOne = 5.0;
        double numTwo = 10.0;

        double addition = numOne + numTwo;  // you cannot use int instead of double. Because double and int different varible.
        // you can assign decimal with double but you cannot assign decimal with int.
        // byte < short < int < long < float < Double

        double subtraction = numOne - numTwo;
        double multiplication = numOne * numOne;
        double division = numOne / numTwo;
        double remainder = numOne % numTwo;
        System.out.println(" Calculation for " + numOne + " & " + numTwo);
        System.out.println(numOne + " + " + numTwo + " = " + addition);
        System.out.println(numOne + " - " + numTwo + " = " + subtraction);
        System.out.println(numOne + " * " + numTwo + " = " + multiplication);
        System.out.println(numOne + " / " + numTwo + " = " + division);
        System.out.println(numOne + " % " + numTwo + " = " + remainder); // for remainder 5 is not enough to go ten . This is java rule. If like this result will be smaller one. like 5

        // all bottom same as above.

        System.out.println(" Calculation for " + numOne + " & " + numTwo);
        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
        System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
        System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
        System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
        System.out.println(numOne + " % " + numTwo + " = " + (numOne % numTwo));



    }
}
