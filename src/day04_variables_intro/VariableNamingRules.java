package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
       // System.out.println("BREAK TILL 4:10 P.M. EST.");
        //int static=22; -> error, static is reserved by java
        int static2=22;
        int _static=22;
        int $tatic=44;
        int staticVar=234;

        int salary$=55;
        //int 1stMonthSalary=3000; -> error, cannot start with number
        int $=10;
        int _=3;
        System.out.println($);
        System.out.println(_);
        //Above variables work fine, but not recommended
        //we should use meaningful variable names
        //`int number-of-friends=400; -> error, does not allowed because you can use only $ and _ in the special character
        int numberOfFriends=401; //it works you can use camel case meaning is start lower case and follow the word upper case first the letter of word.
        int number_of_friends=401;
        // int 1stNum=10; -> CANNOT START WITH THE NUMBER
        int num1=10; // works fine


    }
}
