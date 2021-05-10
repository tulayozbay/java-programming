package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';
        //char letter1 = 'A', char letter2 = 'J';  ->also we an assign like this too.

        System.out.println(letter1 == letter2);//65==74(there is behind the char with ascii table) CHECK IF EQUAL

        System.out.println(letter1 > letter2);//65>74->false CHECK IF A > B
        System.out.println(letter2 > letter1);//74>65->trueCHECK IF B > A

        char grade = 'E';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass);




    }
}
