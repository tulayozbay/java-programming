package day38_methods;
/*
we are learning how to use and create custom method with array
 */
public class ArrayUtils {
    public static void main(String[] args) {

    }



    public static void printArray(int[] nums){
       for (int num : nums){
           System.out.print(num + " ");
       }
        System.out.println();
    }

    public static int sum(int[] nums){
        int sum = 0;
        for (int num : nums){ ///her sayinin toplanmasi yani BRUTFORCE. googledan bak
            sum += num;

        }
        return sum;
    }





}
