package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int num1 = 100;
//        byte b1 = num1;  // it is already gives error we need to type as buttom. because byte smaller than int.

        byte b1 = (byte) num1; // because you need to converted
//        short shNum1 = num1; // still cannot work because short smaller than int
        short shNum1 = (short) num1;
        long lNum1 = num1; //it will works because long already bigger than all.

        System.out.println(num1); //100
        System.out.println(b1); //100
        System.out.println(shNum1); //100

        //TODO: continue more practise on Casting.

    }
}
