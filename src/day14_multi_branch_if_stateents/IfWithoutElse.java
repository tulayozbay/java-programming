package day14_multi_branch_if_stateents;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2020;
        boolean answer;

        if(year == 2020) {
            System.out.println("Covid19 pandemic year.");
            System.out.println("Wear mask and keep distance");
        }

        System.out.println("Keep coding java");

        String country = "USA";
        if (country.equals("USA")) { // for string better to use lie this.
            System.out.println("Washington DC is the capital");
            System.out.println("White House is on Pennsylvania Ave.");

        }

        System.out.println("Welcome to " + country);

    }

}
