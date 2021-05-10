package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10 + 45 = " + Calculator.add(10, 45));

        //Calculator.add(10, 45)--> Calculator class aki bilgileri otomatik olarak kullanmis olur

        //DEBUG yapmak icin stop tusunu koy debug de
         // sonra step into yani asagi bakan ok a tiklayacaksin bunu F7 ile de yapabilirsin
        //sonra mor renkli cikacak method ismi ona bas
        //boylece seni methodu aldigin class a goturecek oradan debug yapmaya devam edeceksin bu sefer kirik ok ile.

        System.out.println("100 - 40 = " + Calculator.minus(100, 40));
        System.out.println("55 / 4 = " + Calculator.divide(55, 4));
        System.out.println("10 * 2 = " + Calculator.multiply(10, 2));

        //Also we can create new variables too
        double d1 = 234.3;
        double d2 = 321.5;
        double result = Calculator.minus(d1, d2);
        System.out.println("result = " + result);



    }
}
