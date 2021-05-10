package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10;//single variable
        //array variable --> this is the longest way to make array variable
        int[] nums = new int[3] ;
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        nums[3] = 100;//here looks like fine but when you print this value it gives out of bond --> ERROR
        //ArrayIndexOutOfBoundsException

        //print values of array
        System.out.println("value at index 0 = " + nums[0]);//index 0
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);
        //System.out.println("value at index 3 = " + nums[3]);--> it going to give ERROR
        //ArrayIndexOutOfBoundsException

        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); //10

        //how to find out the size of the array.
        System.out.println("number of elements = " + nums.length);

        //store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        //chage values in the array:
        nums[0] = 100;
        nums[1] = 300;
        //read the value of index 1 and assign same to index 2
        nums[2] = nums[1];
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);



    }
}
