package day06_arithmetic_operators;

public class ArithmeticOperators {
    public static void main(String[] args){
        System.out.println(5 + 10);
        System.out.println(10-3);
        System.out.println(3 * 3);
        System.out.println(15 / 5);
        System.out.println(10 % 5); // (5 + 5 + 0)elde kalan yazilir. yani left over ya da reminder dedikleri yazilir.
        System.out.println(12 % 5); //(5 + 5 + 2)  elde kalan 2 yani cevap 2
        System.out.println(-2 * 2);

        int chairs = 4 + 2;
        System.out.println(chairs);

        int spoons = 10 + 20 + 12 + 0;
        System.out.println(spoons);

        //There are 42 spoons in kitchen

        System.out.println("There are " + spoons + " spoons in kitchen");
    }
}
