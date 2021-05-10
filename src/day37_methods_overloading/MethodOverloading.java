package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.sum(10, 5);
        sum(10.4, 12.4);
        sum(10, 5.5);//10 will cast automatically
        sum("hello", "world");
        sum(1, 4, 6);
        sum((int)4.2, 5, 9);// it will cast double to int and will remove after point value will be 4
    }

    //has to be each line different signature
    //signature is method name  parameters
    //ex: first line signature is sum(int,int)
    //to make the overloaded method you need two things 1)same method name2)different parameter(t can be diffrent type or diff. quantity)
    // method name is sum
    //for make the overloaded method this part is not effect anything ==> (public static void)
    //return type is not effect==> void, int, String...


    public static void sum(int num1, int num2){//void is return type you type anything else like int, String...
        System.out.println("Signature = method name + parameters ==> sum(int, int)");
        System.out.println("Result = " + (num1 + num2));
    }
    public static void sum(int num1, int num2, int num3) {
        System.out.println("Signature = method name + parameters ==> sum(int, int, int)");
        System.out.println("Result = " + (num1 + num2 + num3));
    }

    public static void sum(double num1, double num2){
        System.out.println("Signature = method name + parameters ==> sum(double, double)");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum(String word1, String word2){
        System.out.println("Signature = method name + parameters ==> sum(String, String)");
        System.out.println("Result = " + (word1 + word2));

    }

}

