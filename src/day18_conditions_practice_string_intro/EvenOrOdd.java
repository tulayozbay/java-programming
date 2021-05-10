package day18_conditions_practice_string_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 5;

        if (num % 2 == 0) { // this condition meaning is num divisible and result is 0. no remainder.
            System.out.println(num + " is EVEN"); // 4 % 2 = 0 so 4 is EVEN-->divisable by 2
        } else {
            System.out.println(num + " is ODD"); //  5 % 2 = 1 so 5 is ODD
        }
    }
}
