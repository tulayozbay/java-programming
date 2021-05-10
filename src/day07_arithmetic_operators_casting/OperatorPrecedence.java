package day07_arithmetic_operators_casting;
/*
matematik kurallarina gore isler java
 */
public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10 + 5); //15
        System.out.println(10 + 5 - 3); //12
        System.out.println(10 - 5 + 3); //8
        System.out.println(10 - (5 + 3)); //2

        System.out.println(2 * 3); //6
        System.out.println(2 * 3 / 3); //2
        System.out.println(20 / (2 * 2)); //5
//        System.out.println(10 / 0); // ERROR / EXCEPTION because you can not divide by 0 for any number.
        System.out.println(0 / 10); //0


        System.out.println(2 + 5  * 3); //17
        System.out.println((2 + 5) * 3); //21

        System.out.println(10 / 3); //3  because java throw away all remainder. yani elde kalanlar cope.
        System.out.println(5 / 2); //2

         // because the above 2 examplesINTEGER DIVISION PROBLEM
// use decimal points number double or float

        System.out.println(10.0 / 3.0); //3.3333
        System.out.println(5.0 / 2.0); // 2.5
    }
}
