package day15_locicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + true);
        System.out.println("!false = " + false);

        int age = 20;
         //check if age is NOT more than 7. print " Need to sit in child car seat. age

         if (!(age > 7)) {
             System.out.println(" Need to sit in child car seat. age = " + age);
         } else {
             System.out.println("Can sit normal seat. age = " + age);
         }

         boolean isSmokingAllowed = false;

         // if smoking is not alllowed: print " Smoking is not allowed here. Exit."

        if (!isSmokingAllowed) { //buradaki ! unlem isareti onu true yapar. unlem degil anlami tasir.
            System.out.println(" Smoking is not allowed here. Exit.");
        } else {
            System.out.println("This area is for smoking.");
        }

        boolean isAffordable = true;

        // if its NOT affordable then print "Item Not Affordable"

        if (!isAffordable) {
            System.out.println("Item Not Affordable");
        }

        String carModel = "Tesla";
        // if its not tesla, print "Not Interested, thank you"
        if(!carModel.equals("Tesla")) {
            System.out.println("Not Interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if inputPassword is NOT equals inputPassword: print "Incorrect Password"
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect Password");
        }
        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect Password");
        }

        //we can do also this way too

        if (inputPassword.equals("abc123")) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Incorrect Password");
        }
    }
}
