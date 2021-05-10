package day39_wrapper_class;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "123.5";
        double price =Double.parseDouble(strPrice);
        if (price > 100){
            System.out.println("expensive");
        }

        String sentence = "I wrote 842 lines of code";
        //split by space, parse index 2 to int
        //int linesOfCode =
        String [] word = sentence.split(" ");
        int linesOfCode = Integer.parseInt(word[2]);
        System.out.println("linesOfCode = " + linesOfCode);



    }
}
