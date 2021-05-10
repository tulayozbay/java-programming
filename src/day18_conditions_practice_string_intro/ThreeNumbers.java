package day18_conditions_practice_string_intro;
//bu tur kodlarda bug cok oluir dikkat et ve tekrar dinle
public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 440;
        int num3 = 1100;

        if(num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is largest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is largest");
        } else {
            System.out.println(num3 + " is largest");
        }
    }

}
