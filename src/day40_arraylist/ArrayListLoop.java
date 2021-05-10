package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();//-->this is polymorphic way of declaring
        System.out.println(nums);//[]-->because we have no any assigning value
        System.out.println("size = " + nums.size());

        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);

        System.out.println("nums = " + nums);

        nums.remove(0);//it means remove 0 index
        System.out.println("nums = " + nums);//34 will be removed because it is index0

        //if you want to remove value not index .
        // You need to use wrapper class.integer wrapper class object you need to create for this problem solving.
        //nums.remove(88); --> you want to move value of 88 but when you write as it is java thinks you want to remove
        //nums.remove(88); -->ERROR --> IndexOutOfBoundsException
        //index 88. unfortunately for this example we have no index of 88 for nums.
        //if you want to move actual value you can do as a below
        nums.remove(new Integer(88));//removes number 88. not 88th index
        System.out.println("nums = " + nums);

        nums.remove(new Integer(5));
        System.out.println("nums = " + nums);//remove fist value of 5

        //for loop - iterate through all values and print
        for (int i = 0; i < nums.size(); i++) { //size works as a length for arraylist
            System.out.println(nums.get(i));
        }

        //for each loop, print all in same line
        // for each loops work with collections Arraylist is one of them
        for (int each : nums){//you can write as it is too --> for (Integer each : nums){
            System.out.print(each + " ");
        }





    }
}
