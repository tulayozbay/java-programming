package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";
        System.out.println(word.toUpperCase(). toUpperCase().length());

        //remove spaces first then print everything uppercase-->IT MEANS YOU ARE CHAINING
        System.out.println(word.replace(" ", "").toUpperCase());//it means we are chaining

        //selenium.findElement(By.id("hi")).click();

        String word2 = "chicago";
        System.out.println(word2.substring(0, 1).toUpperCase() + word2.substring(1));//very good chaining

        String word3 = "ISTANBUL";
        System.out.println(word3.substring(0, 1).toUpperCase() + word3.substring(1).toLowerCase());

        String city = "kAbUl";
                            //read 1st letter.makeUcase     +  read 2nd till last.make lowercase
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean


    }
}
