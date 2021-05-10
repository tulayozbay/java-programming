package GroupStudy1;
/*
[Merge Strings]
User is given two Strings, which could vary in length, merge these Strings so these Strings are
combined into one String. Any extra characters from mismatched length String are at the end.
Ex:
String one = abc
String two = defgh
Output:
adbecfgh
Ex:
String one = java
String two = is
Output:
jiasva
 */
public class Merge {
    public static void main(String[] args) {
        String one = "abc";
        String two = "defgh";  //---> output;adbecfgh
        String combined = "";
        char[] firstWord = one.toCharArray();
        char[] secondWord = two.toCharArray();

        for (int i = 0, j = 0; i < one.length(); i++, j++) {
            combined += firstWord[i] + "" + secondWord[i];
        }

        if (one.length()<two.length()){
            combined+=two.substring(one.length());

        }
        if(one.length()>two.length()){
            combined+=one.substring(two.length());
        }
        System.out.println(combined);
    }
}
