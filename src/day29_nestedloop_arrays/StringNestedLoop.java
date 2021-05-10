package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
                      //0123--> index
        String word = "java";
                     //1234-->length
        for (int i = 0; i < word.length(); i++) {//no = because length start 1 but index start 0
            //outer loop initialization one time
            for (int j = 0; j <= i; j++){ //initialization every time means start always from zero
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        /*
        java
        ava
        va
        a
        OUTER : 0 - word.length()
            INNER : OUTER - word.length()
         */

        for (int i = 0; i < word.length(); i++){
            for (int j = i; j < word.length(); j++){//meaning this code s -> starting from i to till word length to print same line
                System.out.print(word.charAt(j));//print same line because not println
            }
            System.out.println();//when print same line for inner loop then go next line for new printing for inner loop
        }

    }
}
