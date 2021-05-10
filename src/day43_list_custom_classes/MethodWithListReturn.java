package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {
        //1 nanosecond = 1_000_000_000 of a second
        //System.out.println(System.nanoTime());//we use this estimates the code how long does it take to run
        long start = System.nanoTime();//get starting time
        //If we want to call the method we need to store the our variable to the new variable
        List<Integer> mlnNums = getIntegerList();//returns ready ArrayList object no need to write new ArrayList<>();
        //getIntegerList();*-->sadece bunu yazarsak birsey print yapmaz yukaridaki gibi yapmamiz gerekir
        long end = System.nanoTime();//get ending time
        double seconds =(end-start)/1_000_000_000.0;
        System.out.println("ArrayList time seconds = " + seconds);//0.0538784
        System.out.println("ArrayList time = " + (end -start));//47518500
        //System.out.println(mlnNums);//[0,1,2,...,1000000]
        //en altta yazar ne kadar surede yaptigi
        //array list icin sure 3 sec,297 ms

        long st = System.nanoTime();
        int[] arr = getIntegerArray();
        long en = System.nanoTime();
        double seconds2 =(en-st)/1_000_000_000.0;
        System.out.println("Array time seconds = " + seconds2);//0.0143648
        System.out.println("Array time = " + (en - st));//10674400

    }
    /**
        getIntegerList
     No param
     return List<Integer>
     Loop from 0-1000_000
     and add to arraylist then return it

     */

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000_000; i++) {
            nums.add(i);

        }
        return nums;

        //note: if we got with array it is going to be faster. because array faster than arrayllist

    }


    /**
        getIntegerArray
     return int[]
     loop from 0-1000000
     and add to int [] then return it
     */
    public static int[] getIntegerArray(){
        //declare empty array with size-1000_001
        int[] nums = new int [1_000_001];//burada fazladan 1 olmasinin nedeni burasi size i gosterir ve numara 0 dan baslayacagi icin  toplam size 1000001 olur
        for (int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;

        }
        return nums;
    }

    /**
       getDays

     */

}
