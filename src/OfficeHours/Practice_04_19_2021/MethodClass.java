package OfficeHours.Practice_04_19_2021;

public class MethodClass {
    /*
    2 type of method
    void-->run a block of code, there is no return value
            Arrays.sort()--> takes an array, sorts it, does not return anything

    return-->run ablock of code, but there is a return single value --> it can return same time max and other things for example
            Arrays.binarySearch() --> takes an array and element tries to find the element, returns the index of the element
     */

    public static void main(String[] args) {

    }

    public static void methodOne(){
        System.out.println("One");
    }

    public static String methodTwo(){
        return "two";
    }

    public static int methodThree(String word){
        return word.length();
    }

    public static boolean login(String username, String password){
        return true;
    }



}
