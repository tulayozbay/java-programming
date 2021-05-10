package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        /**            012345     */
        String word = "github project";
        System.out.println(word.indexOf("g")); //0
        System.out.println(word.indexOf("u")); //4
        System.out.println(word.indexOf("hub"));//3 --> always print it first one
        System.out.println(word.indexOf("java")); //-1 ---> when computer could not find oit prints as it is
        System.out.println(word.indexOf("t")); //2 --> it is going to run first t
    }
}
