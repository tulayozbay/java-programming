package practice_java_interview_questions;

public class AnagramSecondWay {
    public static void main(String[] args) {
        /*
        9. Two string anagram.
  // isAnagram("listen", "silent")     -> true
  // isAnagram("triangle", "integral") -> true
  // isAnagram("abc", "bca")           -> true
  // isAnagram("abc", "ccb")           -> false
  // isAnagram("aaa", "aaab")          -> false

         */

        System.out.println(isAnagram("triangle", "integral"));
        //if we put some different word as a bottom
        // System.out.println(isAnagram("listeneninna", "silent"));
        //it is going give output StringIndexOutOfBoundsException
        //because both word should be same length . it cannot find the position. but we can fix it
        //how?
        //bu sorunu cozmek icin buna yapilan eklemeyi iyice incele
        // if (word2.indexOf(word1.charAt(i)) == -1 || word1.indexOf(word2.charAt(i)) == -1)--> eklemeler asagidadir.

        //-1 in aciklamasi olarak bu ornek te verilebilir
        System.out.println("tulay".indexOf('r'));//-1


    }

    public static boolean isAnagram(String word1, String word2) {

        //for each te kullanilabilir asagidaki gibi


        for (char each : word1.toCharArray()){
            System.out.println(each);//it is picking one character at the time
            if (word2.indexOf(each) == -1){
                return false;
            }

        }

//        for (int i = 0; i < word1.length(); i++) {
//
//            if (word2.indexOf(word1.charAt(i)) == -1) {
//                return false;
//            }
//
//        }


        //burayi da for each yap
        for (int i = 0; i < word2.length(); i++) {

            if (word1.indexOf(word2.charAt(i)) == -1) {
                return false;
            }

        }

        return true;

    }
}
