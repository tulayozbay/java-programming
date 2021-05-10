package day21_string_manipulation;

import java.sql.SQLOutput;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());//GITHUB
        //change to github to gitlab
        System.out.println(word.replace("hub" , "lab"));//gitlab
        System.out.println("word = " + word);//github --> because we did not assign any other word. Still is print same thing
        //if we sign word with another value as an below it is going to run new value
        word = word.replace("hub" , "lab");
        System.out.println("word = " + word);//gitlab

        //i --> 0  a --> i ------>   gotlib // we can do char or string too . it is one character better to use char.
        System.out.println(word.replace('i' , 'o') . replace('a' , 'i'));//gotlib

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" " , "");
        System.out.println("withNoSpace = " + withNoSpace);
        //"java" --> "selenium"  , "fun" ---> "a lot of fun" --> assign back to with no spaces
        sentence = sentence.replace("java" , "selenium") . replace("fun" , "a lot of fun");
        System.out.println("sentence = " + sentence);
        withNoSpace = sentence.replace(" " , "");
        System.out.println("withNoSpace = " + withNoSpace);

        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over " , "")
                . replace("," , "")
                . replace(" results for java book" , "");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);//convert result string to int
        count++;
        if(count > 0) {
            System.out.println("Search success");
        }



    }
}
