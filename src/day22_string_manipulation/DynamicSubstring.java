package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13, 18));//12345
        System.out.println(result.substring(13));//12345

        //find the index of:
        System.out.println(result.indexOf(":"));//12--> place of 12th
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex + 1));
        //now we can combine into 1 statement
    }
}
