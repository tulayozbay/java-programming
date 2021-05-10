package day18_conditions_practice_string_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "java";

        if (todaysClass.equals("java")) { //todaysClass=="java" we can do this but ir is better to use equals for String
            System.out.println("java is fun");
        }

        int a = 3;
        if (a == 1) //If we dont put {} the firs print statement will run if condition is true but second print statement is independent
            //second statement always run because independent
            System.out.println("a is 10");
            System.out.println("1 is a");

    }
}
