package day20_string_maipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));//true
        System.out.println(company.contains("ital"));//true
        System.out.println(company.contains("l o"));//true
        System.out.println(company.contains("j"));//false
        System.out.println(company.contains("One"));//false--> case sensitive

        //if company contains space, print "company name with multiple words"
        //else "single word company name"

        if (company.contains(" ")) {
            System.out.println("company name with multiple words");
        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";

        // check if " | " is in etsyTitle

        if (etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "Adar";
        //check if firstName contains "A" and "r" at same time
        if (firstName.contains("A") && firstName.contains("r")) {
            System.out.println("both A && r are present");
        } else {
            System.out.println("A || r not present");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        } else {
            System.out.println("nor a or i is present");
        }

        String email =  "ozbayadiguzel@gmail.com";
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("This is a valid email addresses");
        } else {
            System.out.println("This is invalid email.");
        }

    }
}
