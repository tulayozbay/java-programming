package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23,1,34,54,654 ); //asList() helps us converting Arrays to Arraylist
        //Arrays.asList(23, );This Arrays come from Array class.
        System.out.println("nums = " + nums);//nums = [23, 1, 34, 54, 654]
        //yukarida da yazdirdigimiz gibi artik arrayliste cevirdi
        //nums.add(100);--> if we try to add after converting but it doesn't work.
        // Because it is immutable list we cannot add anything to there
        //Murodil have notes in this class please read it.

        /*
        those will not work
        nums.add(100);-->ERROR-->UnsupportedOperationsException
        nums.remove(0);-->ERROR-->UnsupportedOperationsException
        nums.clear();-->ERROR-->UnsupportedOperationsException
        because those are chage the size . However i is size fixed. Cannot be resize
        The reason -->ERROR-->UnsupportedOperationsException is
        when we use Arrays.asList it will return immutable list, that size cannot be modified.
        But we can do any other operations on it.
         */

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2 , 4, 23, 5344, 100));
        //now we can use some methods
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);//it is going to remove index 0
        //numsList.remove(23);//we have no index 23 it shows error --> OutOfBound
        numsList.remove(new Integer(23));// BURADA ISE 23 SAYISINI REMOVE ETTIK.
        System.out.println("numsList = " + numsList);

        /**
         * List String drinksWithCaffeine --> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha
         * int caffeineAmount = 0;
         *      monster, red bull, celsius
         *          caffeineAmount = 150
         *      coffee, kambucha:
         *          caffeineAmount = 112
         *      tea, coke, pepsi, mdew:
         *          caffeineAmount = 35
         */

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster",
                "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);//[coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celsius]
        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine){
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink + " -- > " + caffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drink + " -- > " + caffeineAmount);
            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi")) {
                caffeineAmount = 35;
                System.out.println(drink + " -- > " + caffeineAmount);
            }
        }

        //we can do switch statement too

        for(String drink : drinksWithCaffeine) {
            switch(drink) {
                case "monster":
                case "red bull":
                case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "coffee":
                case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "tea":
                case "coke":
                case "pepsi":
                case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.println(drink));//java 8
        //coffee
        //tea
        //monster
        //red bull
        //coke
        //pepsi
        //mdew
        //kambucha
        //celsius
        drinksWithCaffeine.forEach(drink -> System.out.print(drink.toUpperCase()+ " "));
        //COFFEE TEA MONSTER RED BULL COKE PEPSI MDEW KAMBUCHA CELSIUS

        //If you want to put more action you need to put {}
        drinksWithCaffeine.forEach(each -> { //each loop for arraylist another way
           //do any action
            System.out.println("---------------");
            System.out.println("each = " + each);
            System.out.println("---------------");
        });







    }
}
