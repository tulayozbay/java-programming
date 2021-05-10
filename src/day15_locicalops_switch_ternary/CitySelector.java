package day15_locicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";

            // Moscow or Tampa
        if(city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        }else {
            System.out.println("Not considering - " + city);
        }

        String teacher =  "Saim";
        //Saim Or Murodill -> it is a java class with Saim
        // otherwise -> Soft skill class with Nadir

        if (teacher.equals("Saim") || teacher.equals("Murodill")) {
            System.out.println("It is a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }

        //1- teacher Saim or Murodill -> It is a java class
        //2 - teacher Nadir -> Soft skill class with
        // any other teacher -> Some class with Gurhan / Akbar

        if (teacher.equals("Saim") ||teacher.equals("Murodill")) {
            System.out.println("java class with " + teacher);
        } else {
            System.out.println("Some other class with " + teacher);
        }

        // company - "Google" OR salary >= 100k -> accept offer
        String company = "Google";
        double salary = 85_000.0;

        if (company.equals("Google") || salary >= 100_000.0) {
            System.out.println("Accepring offer from " + company);
        } else {
            System.out.println("Rejecting offer from " + company);
        }
    }
}
