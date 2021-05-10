package Day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversation {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "123 Java IS Fun.";

        System.out.println(word);
        //conver to all lowercase
        System.out.println(word.toLowerCase());
        // also we can put string value instead of object name
        System.out.println("CyberTek".toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLCase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLCase);
        //change word to all lowercase letters. and assign back it means we change word value permanently
        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase = " + company.toLowerCase());
        System.out.println("java".toUpperCase());

        //change variable company " Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();//we reassingthe company variable
        System.out.println("company = " + company);

    }
}
