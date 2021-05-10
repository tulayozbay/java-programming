package day09_scanner_practice;

//1)IMPORT SCANNER ->IMPORT means I would like ti use this class in my program

import java.util.Scanner; //java.util bir paket ismi scannerlar icin

public class AskAgeV2 {
    public static void main(String[] args) {
        //2)CREATE SCANNER OBJECT
        Scanner scan = new Scanner (System.in); //Scanner scan-> declare a variable of data type Scanner. Scanner is non primitive
                                                 // new meanings ->create new object from a class
        System.out.println("How old are you?");
//        int age = 33; bu durumda eski usul olur.eger type from keybioard and assign here denilince asagidakini yapmaliyiz
//        System.out.println(age);
        int age = scan.nextInt(); // asagida kirmizi calisan buttona ne yazarsan sonucu oyle verir.
//        scan.nextInt(); //bunu yaptiginizda program hep calisir asagida sol tarafta kirmizi kare isaretten anlasillir programin calistigi.this line wating for us to type as amzon search button.
        System.out.println(age + "-that's great age!");
//        bu asamadan sonra run dersek how old are you cikacak ve iz asgidaki kirmizi yere hangi yasi yazip entere basarsak hemen o yas ve thats great age yazisi cikacak.
//        scan.close(); eger istersen optional olarak bu kapatir scanneri yani calisan programi.
    }
}
