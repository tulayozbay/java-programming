package OfficeHours.Practice_03_22_2021;

public class OperatorExample {
    public static void main(String[] args) {
        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;//remainder yani % en son yapilir.// 1
        System.out.println("c = " + c);//1
        System.out.println("b = " + b);//2
        System.out.println("a = " + a);//2



  int a2=3, b2=2; // a = 2 b = 2
        long c2 = (a2-- + b2) * 2 / 3 % 2;
           //    ( 3   + 2 ) * 2 / 3 % 2
            //         5 * 2 / 3 % 2
        //             10 / 3 % 2
        //             3 % 2
        //                 1

        // a = 2
        // b = 2
        // c = 1
       short c4 = (short)((a2-- + b2) * 2 / 3 % 2);

    }
}
