package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'i';
        int index = -1;

        for (int n = 0; n < word.length(); n++) {
           // System.out.println(n + " - " + word.charAt(n));
            if (word.charAt(n) == letter) {
                index = n;//we did this one because cunku n sayisini indexe
                // store etmemiz gerekir cunku loop un disina ciktigimizda ne degerini kullanamayiz
                // indexi kullanabiliriz. bu yuzden boyle yazdik.
                System.out.println(letter + " is found at index " + index);
              //  return;//-->when you found exit the whole main method
                break;//--> exit the FOR LOOP method--> if you are inside the loop PLEASE USE BREAK;
                //return; is more powerfull than break;-->
                // if you do return it wont go last if blocks when it found then exit the main method

            }
        }
            //index = n;
        // yukaridaki kisim burayi anlamlandirabilmek icin cunku burada n degeri lazim ama
        // n vaiable kullanilamaz n degerini indexe depolamak icin yariyoruz bunu
        if (index == -1){
            System.out.println(letter + " is not present");
        }

    }
}
