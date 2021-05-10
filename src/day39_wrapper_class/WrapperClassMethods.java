package day39_wrapper_class;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.sql.SQLOutput;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));//10
        System.out.println(Integer.sum(50,35));//85
        System.out.println(Integer.min(5,2));//2
        System.out.println("Minimum Integer: " + Integer.MIN_VALUE);
        System.out.println("Maximum Integer: " + Integer.MAX_VALUE);

        System.out.println(Double.max(235.4, 254.3));
        System.out.println("Minimum Double: " + Double.MIN_VALUE);
        System.out.println("Maximum Double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(6,1));//1-->first number larger than second
        System.out.println(Double.compare(5,5));//0-->both numbers are equal
        System.out.println(Double.compare(5,45));//-1-->first number smaller than second

        System.out.println(Character.isDigit('8'));//true
        System.out.println(Character.isDigit('v'));//false
        System.out.println(Character.isAlphabetic('Q'));//true
        System.out.println(Character.isLetter('r'));//true
        System.out.println(Character.isLetter('9'));//false

        char letter = 'A';
        if (Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))){//isLowerCase dersek lower case olanlari yazar
                System.out.print(word.charAt(i));//uppercase olanlari yazar
            }

        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE.equals(5 > 3));
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TRUE);


    }
}
