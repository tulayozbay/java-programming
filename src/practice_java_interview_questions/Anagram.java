package practice_java_interview_questions;

public class Anagram {

    public static void main(String[] args) {
        /*
        9. Two string anagram.
  // isAnagram("listen", "silent")     -> true
  // isAnagram("triangle", "integral") -> true
  // isAnagram("abc", "bca")           -> true
  // isAnagram("abc", "ccb")           -> false
  // isAnagram("aaa", "aaab")          -> false

         */

        System.out.println(isAnagram("listen", "silent"));
        //if we put some different word as a bottom
        // System.out.println(isAnagram("listeneninna", "silent"));
        //it is going give output StringIndexOutOfBoundsException
        //because both word should be same length . it cannot find the position. but we can fix it
        //how?
        //bu sorunu cozmek icin buna yapilan eklemeyi iyice incele
        // if (word2.indexOf(word1.charAt(i)) == -1 || word1.indexOf(word2.charAt(i)) == -1)--> eklemeler asagidadir.


    }

    public static boolean isAnagram(String word1, String word2){

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
                                                        //cifte dogrulama yapmak icin
            if ((i < word1.length() && word2.indexOf(word1.charAt(i)) == -1) || (i < word2.length() && word1.indexOf(word2.charAt(i)) == -1)){//simdi string null a doner ama burada int e don
                //donmeli cnku indexof return the position of trhe character bu yuzden karakteri bulamadiginda -1 e doner.
                return false;
            }
        }

        return true;
    }

}
