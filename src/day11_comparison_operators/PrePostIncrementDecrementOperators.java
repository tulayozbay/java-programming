package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT (++ -> means increase by 1)
        int num1 = 10;
//        ++num1;
//        int num2 = ++num1;
        int num2 = ++num1;//increment value then assign the value//it means increase num1 by 1. that's why num1 = 11 too.
        System.out.println("num1 = " + num1);//11
        System.out.println("num2 = " + num2);//11

        //POST-INCREMENT //add 1 afterwards
        int num3 = 4;
//        int num4 = num3;
//        num3++;//add 1
        int num4 = num3++;
        System.out.println("num3 = " + num3);//9
        System.out.println("num4 = " + num4);//8

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;//first assign then increased.
        System.out.println("kiwi = " + kiwi);//16
        System.out.println("kiwiBasket = " + kiwiBasket);//15

        int cars = 5;
        System.out.println(++cars);//6

        int sedans = 10;
        System.out.println(sedans++);//10-> because first assign then increase if we print again it gives 11because (then incerase)
        System.out.println(sedans);//11-> because above one first assign then increase .

        int a = 50;
        int b = 22;
            //  50  +  23
        int c = a++ + ++b;
        //->adds 1 to a HERE, at this step afterwards

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);





    }
}
