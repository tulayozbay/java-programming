package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str){
        return ( str == null || str.isEmpty());//==> bu sekilde de yazilabilir ya da asagidaki gibi de yazilabilir if statement ile

//        if (str == null || str.isEmpty()){ //BURADA | BU ISARATTEN BIR TANE VE 2 TANE NE OLACAGINI ANLATIYOR ANLAMADIM NISAN 18 DAY 38 SAAT 11.45 FALAN
//           //NULL NEDEN BASTA YAZIILIR ONU ACIKLADI O DA NOTLARDA VAR
//            return true;
//        }
//        return false;

    }
    /**
     * ISTE TAM OLARAK ACIKLAMASI DA BURADA
     * - if (str.isEmpty || word == null ){ → this will give NullPointerException
     * - if(word == null || word.isEmpty()) { → this will be true, NO ERROR
     * - if(word == null | word.isEmpty()) { → this will give NullPointerException because you are using one pipe
     * which forces the program to check both sides
     */


    public static boolean isPalindrome(String str){

        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    public static String reverse(String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }


}
