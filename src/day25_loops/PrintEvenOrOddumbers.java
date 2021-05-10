package day25_loops;

/*
1) print all even numbers between 1-100
2) print all odd numbers between 1-100
 */

public class PrintEvenOrOddumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS 0 - 100: ");
        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0){
                System.out.print(n + " ");
            }
        }

        System.out.println("\nODD NUMBERS 0 - 100:");
        for (int k = 0; k <= 100; k++){
            if (k % 2 == 1){ // if (k % 2 != 0}--> you can assign all odd number as it is too
                System.out.print(k + " ");

            }

        }

    }
}
