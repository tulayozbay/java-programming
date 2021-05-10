package day18_conditions_practice_string_intro;

public class MultiBrancIf {
    public static void main(String[] args) {
        int number = 5;
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {  //else if (number == 0) { -->we can do this but computer check one more tim,e run too much we can do else statement
            System.out.println(number + " is zero.");
        }
    }

}
