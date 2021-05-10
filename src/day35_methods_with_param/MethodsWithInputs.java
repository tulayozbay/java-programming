package day35_methods_with_param;

import java.lang.annotation.IncompleteAnnotationException;

public class MethodsWithInputs {
    public static void main(String[] args) {//inputs meaning here paramater
        displayValue(5);
        displayValue(54);
        int count = 55;
        displayValue(count);//meaning is --> num = count;
        greetByName("Tulay");
        greetByName("Inan");
        greetByName("Adar");
        String name = "Guzel Aile";
        greetByName(name);
    }
    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }

    /**
     * method name: greetByName
     * @param/input: String name
     * It prints "Hello {name}, how are you today?"
     */
    public static void greetByName(String name){
        System.out.println("Hello " + name + ", how are you today?");
    }

}

