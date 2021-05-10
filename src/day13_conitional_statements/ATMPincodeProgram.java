package day13_conitional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        int secretPincode = 2233;
        int inputPincode = 2233;

        if(secretPincode == inputPincode) {
            System.out.println("Welcome to your account.\n You can withdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect pincode! " + inputPincode + "\n Please try again.");
        }

        System.out.println("Thank you for using TD Bank ATM!");
    }

}
