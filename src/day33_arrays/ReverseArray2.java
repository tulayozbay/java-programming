package day33_arrays;

import java.util.*;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //swap those using additional variable
        int temporary = num1;
        num1 = num2;
        num2 = temporary;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //reverse without a loop--> using temporary variable

        //            0   1   2  3
        int[] nums = {5, 10, 4, 100};
        System.out.println("Before swap: " + Arrays.toString(nums));

        temporary = nums[0];
        nums[0] = nums[3];
        nums[3] = temporary;

        System.out.println("After 1st and last swap " + Arrays.toString(nums));

        //Reverse with loop

        //            0   1   2  3
        int[] nums2 = {5, 10, 4, 100};

        System.out.println("Before: " + Arrays.toString(nums2));

        for (int i = 0; i < nums2.length/2; i++){
            int temporary2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temporary2;

        }

        System.out.println("After: " + Arrays.toString(nums2));

                        //  0       1       2     3       4
        String[] words = {"java", "html", "js", "ruby", "css"};

        System.out.println("words reverse before = " + Arrays.toString(words));

/**
 * Bu yolla yapilir ayyrica asagidai yolla da yapilir
 *
        for (int i = 0; i < words.length/2; i++){
            String temporary3 = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temporary3;
        }
 */
        // i -> 2, j -> 2                     2
        for(int i = 0, j = words.length-1; i < words.length/2; i++, j--) {
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }

        System.out.println("words after reverse = " + Arrays.toString(words));

    }

}
