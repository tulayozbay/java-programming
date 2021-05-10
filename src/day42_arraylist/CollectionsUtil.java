package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters =new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size =>"+letters.size());

        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println("reversed => "+letters);
        //how many 'a' in out ArrayList
        System.out.println(Collections.frequency(letters, 'a'));

        int vCount=Collections.frequency(letters,'v');
        System.out.println("V Count => "+vCount);
        System.out.println("Max char => "+Collections.max(letters));

        System.out.println("Min char => "+Collections.min(letters));
        Collections.reverse(letters);
        Collections.replaceAll(letters,'a','u');
        Collections.replaceAll(letters,'i','j');
        System.out.println("after replaceALL => "+letters);
        Collections.sort(letters);
        System.out.println("Sort => "+letters);

        List<Integer> nums =Arrays.asList(5152,451,1212,1545,22,1,144,12,1,5,5,5,5,12);
        System.out.println("nums => "+nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse => "+nums);

        int max= Collections.max(nums);
        int min= Collections.min(nums);
        System.out.println("Max number => "+max);
        System.out.println("Min number => "+min);

        int countOfFives=Collections.frequency(nums,5);
        System.out.println("5 => "+countOfFives);

        int countOfOnes=Collections.frequency(nums,1);
        System.out.println("1 => "+countOfOnes);

        Collections.replaceAll(nums,5,50);
        System.out.println("after replaceAll => "+nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("after reverse sort => "+nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle => "+nums);

    }
}
