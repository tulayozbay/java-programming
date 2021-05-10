package OfficeHours.Practice_04_19_2021;
import day38_methods.StringUtils;
import day38_methods.*;//-->buraya yildiz koyunca o paketteki tum dosyalari import etmis oluyorsun
public class ReverseEachWord {
    /*
    Reverse Each word
Given a String, reverse each individual word and print the result Hint: Use a nested loop, split
Input:
It started to snow in Chicago
Output:
tI detrats ot wons ni ogacih
     */
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in Chicago"));
    }

    public static String reverseEachWord(String str) {

        String reverse = "";

        for(String each : str.split(" ")){

            reverse += StringUtils.reverse(each) + " ";

        }

        return reverse.trim();

    }

}

