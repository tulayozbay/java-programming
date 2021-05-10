package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 10; outer++){
            for (int inner = 1; inner <= 10; inner++){
                System.out.print(outer * inner + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " x " + i + " = " + j * i + "\t | \t");
            }
            System.out.println("");
        }

    }

}
