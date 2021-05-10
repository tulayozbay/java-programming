package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Enter rent and month: ");
        double rent = scan.nextDouble();
        scan.nextLine();//when we put this it fix the known bug. WORKAROUND diye adlandirilir isyerlerinde.\
        //eger bu yukaridakini koymazsak rentin degerini yazip entere basinca month in degerini yazmamaiza izin vermez. burada bug veya
//        glitch olusur. onu tamir etmek icin bu yapilir.
        String month = scan.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);
    }
}
