package day26_loops;

/*
dd new package day26_loops
add new class MultiplicationTable

number -> 2
using a for loop, print multiplication table for the number

2 x 1 = 2
2 x 2 = 4
...
2 x 10 = 20
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 2;

        /*
        if number less than 1 or more than 10
        print " ERROR: invalid input"
        exit main method : return;

         */

        /*

        if (number < 1 || number > 10){ //int number = (10 dan dah buyuk ya da sifirdan
            // daha kucuk bir sayi koyarsan o zaman if block calisir)
            System.out.println(" ERROR: invalid input");
            return;//eger bunu koymazsak hem error yazar hem koydugumuz int number degerini print yapar.
            //return; meaning is EXIT MAIN METHOD/STOP THE PROGRAM
        }

         */

        for (int i =1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));

        }

        //UZUN  YOL
        /*
          // System.out.println(number +" x "+ 1 +" = "+(number*1));
//        System.out.println(number +" x "+ 2 +" = "+(number*2));
//        System.out.println(number +" x "+ 3 +" = "+(number*3));
//        System.out.println(number +" x "+ 4 +" = "+(number*4));
//        System.out.println(number +" x "+ 5 +" = "+(number*5));
//        System.out.println(number +" x "+ 6 +" = "+(number*6));
         */

    }
}
