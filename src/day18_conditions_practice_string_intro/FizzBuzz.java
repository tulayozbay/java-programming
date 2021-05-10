package day18_conditions_practice_string_intro;
/**
 * "FizzBuzz" -> when number is divisible by 3 and(&&) 5
 * "Fizz" -> when number is divisible by 3
 * "Buzz" -> when number is divisible by 5
 * otherwise print number
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int number = 55;

        if (number % 3 == 0 && number % 5 == 0) {// bu kisim enustte olmali yoksa yanlis output verir. //also we can do if (number % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
