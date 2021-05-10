package day18_conditions_practice_string_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int expLast4SSN = 1234;
        int expPinCode = 4321;//expecting pin code

        int last4SSN = 1234;
        int pinCode = 4321;

        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expLast4SSN) { //neested if statement
                System.out.println("Last 4 SSN number is incorrect");
            }
            if (expPinCode != pinCode){
                System.out.println("Pin code is incorrect");
            }
        }

    }
}
