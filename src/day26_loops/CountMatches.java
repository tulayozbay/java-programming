package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {//eger i nin gosterdigi karakter letter esitse
                count++;//eger if statement dogruysa count 1 arttir demek
            }
            
        }
        System.out.println("There are " + count + " " + letter + "' s in " + word);
    }
}
