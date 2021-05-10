package day38_methods;
/**
 * import all static methods. so that you can just call by method name, without classname
 */

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAiL: Username cannot be null or empty");
        }


        System.out.println("isPalindrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(tulay) = " + isPalindrome("tulay"));//we do not have to put class name
        // because we import the class as it is ///import static day38_methods.StringUtils.*;///

        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
        System.out.println(StringUtils.reverse(word));

        String word2 = "sunday";
        String revWord2 = StringUtils.reverse(word2);
        System.out.println("word2 = " + word2);
        System.out.println("revWord2 = " + revWord2);


    }



}
