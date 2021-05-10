package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("FIZZBUZZ NUMBERS 0 - 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0){ // (i % 3 ==0 && i % 5 == 0)
                System.out.println( "FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            }else if (i % 5 == 0){
                System.out.println("BUZZ");
            }else {
                System.out.println(i);
            }
        }


    }

}
