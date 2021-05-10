package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int minutes = 0; minutes <= 5; minutes++) {
            System.out.println("\nminutes = " + minutes);//minutes = 0...minutes = 5
            for (int seconds = 0; seconds <= 60; seconds++) {
                System.out.print(seconds + " ");//0 1 2 3 ...58 59 60
            }

        }
        for (int minutes = 0; minutes <= 4; minutes++){
            for (int seconds = 0; seconds <= 59; seconds++) {
                System.out.println(minutes + " : " + seconds);
            }
        }


    }
}
