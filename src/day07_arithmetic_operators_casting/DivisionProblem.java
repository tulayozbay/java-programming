package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args) {
        System.out.println(10 / 3); //3
        System.out.println(10.0 / 3.0); //3.3333333333333335
        System.out.println(5 / 2); //2

        int num1 = 40;
        int num2 = 15;
        System.out.println(num1 / num2); //2

        System.out.println(5.0 / 2.0); //2.5
        System.out.println(5.0 / 2); //2.5  if you write any number with decimal result ill be decimal too.

        double d1 = 12.0;
        double d2 = 5.0;
        System.out.println(d1 / d2); //2.4

        int count = 100;
        double dCount = 30.0;
        System.out.println(count / dCount);

        int n1 = 4;
        byte b1 = (byte) n1;



    }
}
