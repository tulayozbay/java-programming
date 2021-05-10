package day36_methods_with_return;
import java.util.*;

/*
add new class Info

Method name: fullName
No params
returns "Mike Smith"

Method name: isMarried
return false

method name: getAge
returns 35
 */
public class Info {
    public static void main(String[] args) {
        fullName();//fullname methodunun altina yazdigimiz sout yi tekrar yazdirir. yani bu yuzden o sout 2 defa yazdirilmis olur
        System.out.println("Full Name: " + fullName());
        System.out.println("Is Married? : " + isMarried());
        System.out.println("Age: " + getAge());
        System.out.println("Birth Year: " + getRandomYear());//it gives different number each print time
        // because it will random the year till 2021->DYNAMIC.different year each time

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);


    }
    public static String fullName(){
        System.out.println("inside fullName method");//fullName den sonra sout yapilir ve yukarida cagrilmazsa da yazdirilir cagrilirsa iki defa ayzdirilmis olur
        return "Mike Smith";
        //WE CANNOT PRINT ANYTHING AFTER RETURN STATEMENT
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 35;
    }

    public static int getRandomYear(){ // for random we need to put import class
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;

    }

}
