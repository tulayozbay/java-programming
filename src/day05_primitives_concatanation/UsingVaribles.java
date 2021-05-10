package day05_primitives_concatanation;

public class UsingVaribles {
    public static void main(String[] args){
        int a=1;
        int b=a;
        System.out.println(b);
        System.out.println(a);
        int num1=100;
        int num2=num1;
        System.out.println(num1);
        System.out.println(num2);

        num1=200;
        System.out.println(num1);
        System.out.println(num2);

        int n1=55;
        int n2=n1;
        int n3=n2;

        /*
            n1-> 55
            n2-> 55
            n-> 55
         */
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int tulaysZipCode=40509;
        int inansZipCode=tulaysZipCode;

        System.out.println(inansZipCode);
        System.out.println(tulaysZipCode);

        tulaysZipCode=40517;

        System.out.println(inansZipCode);
        System.out.println(tulaysZipCode);

    }
}
