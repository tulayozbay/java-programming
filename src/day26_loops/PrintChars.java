package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) { //we did not do <= because
            //that time length gives us 4 but for is not working with charAt(); as a bottom.
            System.out.println(word.charAt(i));
        }


       /**
        * long way, without loop.
        System.out.println(word.length());//kac karakter oldugunu verir//
        System.out.println(word.charAt(0));//charAt(); bize herbir karakteri verir//j
        System.out.println(word.charAt(1));//a
        System.out.println(word.charAt(2));//v
        System.out.println(word.charAt(3));//a
       //System.out.println(word.charAt(4));//it gives ERROR
*/

       /*
       print word letters in reverse
       REVERSE : kelimeyi tersinden yazmak demek
        */
        for (int i = word.length() - 1; i >= 0; i--) {//int i = word.length() - 1 boyle yaptik
            //cunku 1 cikarmamiz gerekli yoksa charAt(4); yazarsa program hata verir.
            System.out.println(word.charAt(i));
        }

    }
}
