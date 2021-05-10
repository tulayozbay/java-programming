package day15_locicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        //location, salary, remote, benefits
        String location = "Honolulu";
        double salary = 120_000.0;
        boolean remote = true;
        boolean benefits = false;

        if (location.equals("Honolulu") && salary >= 120_000.0 && remote && benefits) {

            //if (location.equals("Honolulu") because this variable is String.
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
