package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");
        //removeIf method - java 8 -> accepts lambda - and easy to remove without loop
        dayNames.removeIf(d -> d.length() == 6);
        System.out.println("dayNames after removeIf = " + dayNames);

        System.out.println(getRandomlist(10));//[53, 71, 14, 45, 70, 21, 84, 15, 39, 36]--> rastgele sectigi 10 ayri numara
        List<Integer> nums = getRandomlist(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        //if you want remover the number which are less than 90
        //this is the short way to do
        nums.removeIf(n -> n < 90);//removes nums less than 90
        System.out.println("nums = " + nums);


    }

    public static List<String> getDays() {
        //List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));//kisa yol
        //uzun yol
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday");
        days.add("Friday"); days.add("Saturday"); days.add("Sunday");
        return days;
    }
    /**
     getRandomList
     param: int size
     return List<Integer>
     generate random numbers (0 - 100) the count of size, and assign to List then return
     getRandomList(3) -> 43,12,54
     getRandomList(2)->1,4
     */

    public static List<Integer> getRandomlist(int size) {
        Random random = new Random();//new Random object with 0-100 limit
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            //bu asagiaki kod ayni sayinin iki defa yazilmasini engeller yani rasgele secilen numaralariniki tanesi ayni olmamasini isterssen
            //bunu kullanmalisin
//            int n = random.nextInt();
//            if(!nums.contains(n)){
//                nums.add(n);
//            }
            nums.add(random.nextInt(101));//generate random number and add to list

        }
        return nums;


    }
}
