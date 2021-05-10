package day29_nestedloop_arrays;

/*
add new class StarsNestedLoop
main method:

OUTER 1 - 5
    INNER 1- 10


* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
--------------------------

OUTER : 1 - 10
    INNER: 1 to OUTER

*
* *
* * *
* * * *
.....
 */

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 1; inner <= 10 ; inner++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        for (int outer = 1; outer <=10 ; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("* ");

            }
            System.out.println();//it is going to new line after every loop.

        }

//        yildizlari tersten yazmak icin yontem

        for (int outer = 1; outer <=10 ; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("* ");

            }
            System.out.println();//it is going to new line after every loop.

        }
    }
}
