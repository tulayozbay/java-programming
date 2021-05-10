package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        /**
         * below is infinite loop for loop like : while (true) {   }
         * for (;;){
         *     System.out.println("Java is fun!);
         * }
         */

        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello World!");
        }

        //for loop: 1-10. print the numbers
        for (int i = 1; i <= 10; i++) {
            System.out.println("number = " + i);
        }

    }
}
