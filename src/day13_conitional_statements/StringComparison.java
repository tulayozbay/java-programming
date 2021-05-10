package day13_conitional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if(city.equals("Los Angeles")) {
            System.out.println("It is LA");
        } else {
            System.out.println("It is NOT LA");
        }

        String weather = "sunny";
      //  if(weather.equals("sunny")) { -> it works, not error, but AVOID. in java not ok to use.
        if(weather.equals("sunny")) {
            System.out.println("lETS GO OUT AND CODE JAVA!");
        } else {
            System.out.println("STAY HOME AND CODE JAVA!");
        }

    }
}
