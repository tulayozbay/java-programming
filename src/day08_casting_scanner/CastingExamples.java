package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        //byte - short - int - long
        byte num1 = 100;
        short num2 = num1; //yopu dont have to casting because short already bigger than byte
        int num3 = num1; //already int bigger than byte
        int num4 = 1000;
        long num5 = num4; // long is already bigger than int
        float num6 = 124.4F;
        double num7 = num6; // double bigger than float
//        BIGGER meaning is  more memory used.

        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);//3456
        System.out.println("num9 = " + num9);//3456.0 -> it gives as decimal because we assigning used DOUBLE

        System.out.println("======================");

        int num10 = 22;
        byte num11 = (byte) num10;
        short num12 = (short) num10;
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);
        
        double num13 = 55.3;
        float num14 = (float) num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);
        
        double num15 = 1234.5;
        int num16 = (int) num15;
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16); // converted without decimal because we use whole number variable which is int.
        
        int num17 = 200;
        byte num18 = (byte) num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18); //burada verdigi sonuc ilginc pek anlamadim.ancak binary e ceviri bytein icine sigmio falan dedi tekrar dinle

//        CASTING CHAR TO INT

        char letter = 'T';
        int numLetter = letter;// it works because if you say char it gives number even if you assign the letter with chard.
        // you can check every single char assignment on ASCII table.
        System.out.println("letter = " + letter);




    }
}
