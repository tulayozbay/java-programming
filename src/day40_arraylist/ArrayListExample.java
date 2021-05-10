package day40_arraylist;
import java.util.*;//you can put ArrayList instead of *
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
//        nums.add("java"); --> it wont acceptable because we declare arraylist integer. integer will not accept String

        System.out.println("size = " + nums.size());//3

        //reading from arraylist
        System.out.println("index 0 = " + nums.get(0));//5
        System.out.println("index 1 = " + nums.get(1));//7
        System.out.println("index 2 = " + nums.get(2));//11
        //System.out.println("index 13 = " + nums.get(3));//-->ERROR --> IndexOutOfBoundsException

        //print all values in same line:
        System.out.println(nums);//[5, 7, 11]


        nums.remove(1);//remove element at index 1
        System.out.println(nums);//[5, 11]-->index 1 == 7 is removed




    }
}
