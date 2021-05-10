package OfficeHours.Practice_05_03_2021;
/*
Fourorless
GivenanArrayList of Strings, go through and read only Strings that are 4 characters or less.
Take those Strings and put them into a different
ArrayListEx:Input:“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
Output:[ tree, loop, cat ]
 */
import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "java", "tree", "cat", "animal", "shortcut"));

        ArrayList<String> list2 = new ArrayList<>();

        for(String each : list){

            if(each.length() <= 4) {
                list2.add(each);
            }

        }

        System.out.println(list2);
    }
}
