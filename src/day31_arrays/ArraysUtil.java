package day31_arrays;

import java.util.Arrays; //or we can do --> import java.util.*;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums ={100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(Arrays.toString(nums));//it prints as it is--> [100, 5, 1, 7, 0, -4, 44, 33]

        //we can sort them as below
        //sort nums-->rearrange values
        Arrays.sort(nums);
        //print the after sorting
        System.out.println(Arrays.toString(nums));//[-4, 0, 1, 5, 7, 33, 44, 100]

        System.out.println("min value = " + nums[0]);//-4
        System.out.println("max value = " + nums[nums.length-1]);//100

        //Arrays.sort(nums, Collections.reverseOrder());-->this is work only class type. you need to changel int to integear

        String[] words = {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(", ", words) + "]");

        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words));


    }
}
