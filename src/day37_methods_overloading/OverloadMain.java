package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        // this method signature is main(String)
        //(String[] args)==>1)when you remove[] this. run button wont show->computer things it is normal method not main.
        //you can put [] this after args either. arrays will accept it
        //2)you can put differentName instead dof args or anything else you can put it does not matter
        //if you change the return type anything else instead of void run button will not work as well.

        System.out.println("Hello from real main method");
        main(10);
        System.out.println(Arrays.toString(args));//bunu print yaptigimizda asagidakini verir
        //[banana, apples, tomatoes]
        //BUNU NASIL YAPTIK?
        /**
         * 1) yikarida class ismi yazan yere geldik ve edit configuration dedik
         * 2) acilan sayfada arguments kismina bunlari aralarinda sadece bosluk vererek virgul koymadan yazdik
         * Sonra Arrays.toString(args)==> yani main methodun valuesini yazdik ve sout ile birlestirince bunlari print etti
         * bunu nerede kullandigimizi ogren?
         */

    }

    /**
     * overloading main method:
     * same name + different parameter
     * JDK does not look for this one to run
     */

    public static void main(int num){
        System.out.println("num = " + num);
    }



}
