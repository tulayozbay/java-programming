package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int apples = 0;
        while (apples <= 3) {
            System.out.println("apples =--> " + apples);
            apples++;
            //output is going to be
            //apples =--> 0
            //apples =--> 1
            //apples =--> 2
            //apples =--> 3
        }

        System.out.println("apples = " + apples);//output: apples = 4

        //infinite loop
        while (true) { //
            System.out.println("Hello World");


        }

    }
}
