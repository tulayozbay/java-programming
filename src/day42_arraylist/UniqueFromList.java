package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {

    public static void main(String[] args) {
        //declare Integer arraylist with following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("\nuniqueList = " + uniqueList);
    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {//bunu kisa yoldan apmak icin bir yolsoyle saat
        // 9 dan once 05/04/202120.siradan30.siraya kadar sec refactor extract method yap otomatik olarak custom method verecek
        //new arraylist to store only uniques
        List<Integer> uniqueList = new ArrayList<>();
        System.out.println(nums);
        //loop through the list
        for (int num: nums) {
            //check if number appears only ONCE in the list
            if (Collections.frequency(nums, num) == 1) {
                //print the number
                System.out.print(num + " ");
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }
}



