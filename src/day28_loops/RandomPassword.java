package day28_loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {//random= rastgale demek
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";//71 karakter var
        Random random = new Random();//helps generate random number
        String password = "";

        for(int i = 1; i <= 8; i++) {
            int index = random.nextInt(71); //random num 0 - 70
            System.out.print(source.charAt(index));// bu kisim ilk 70 karakterden rastgele 8 karakter sececek
            // System.out.println(random.nextInt(source.length()));
            //add the char to password variable using +=
            //password = password + source.charAt(index);--> uzun yol asagida kisa yolu var
            password += source.charAt(index);
        }


        System.out.println("\nYour password = " + password);



    }
}
