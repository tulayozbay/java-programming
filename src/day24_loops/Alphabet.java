package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
         // System.out.println("letter = " + letter);
        //letter++;
        //System.out.println("letter = " + letter);//b --> because it is adding +1 it means next alphabet in the ASCII table.
        while (letter <= 'z') {
            //please print a b c d e ...
            //z,......a
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();//arada bosluk birakmak icin

        //print alphabet reverse order
        letter = 'z';
        while(letter >= 'a'){
            System.out.print(letter + " ");
            letter--;
        }


    }
}
