package OfficeHours.Practice_03_30_2021;

/*
Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.

Assume that the String is not empty and that n is in the range from 1 to str.length().

Examples:

input: abXYabc
input: 1

output: true
 */

public class PrefixAgain {
    public static void main(String[] args) {

        String str = "abXYabc";
        int n = 2; //--> it is going to show us string str letters first n letters

        //prefix= first couple letters of the word
        String prefix = str.substring(0,n);//0, 2 -->ab
        String remaining = str.substring(n);// XYabc

        System.out.println(remaining.contains(prefix));//when value is 2 -->
        // it means remaining (XYabc) contains prefix(ab) lettter
        // contains give us boolean//output: true


    }
}
