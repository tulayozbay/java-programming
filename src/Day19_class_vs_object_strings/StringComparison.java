package Day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city= "Diyarbakir";
        //EQUALS() method - CASE SENSITIVE COMPARISON
        System.out.println(city.equals("Diyarbakir"));//true
        System.out.println(city.equals("diyarbakir"));//false --> equals method is case sensitive
        System.out.println(city.equals("Diyarbakir "));//false-->should be exact match there is space.

        //EQUALSIGNORECASE() method -- CASE INSENSITIVE
        System.out.println(city.equalsIgnoreCase("Diyarbakir"));//true
        System.out.println(city.equalsIgnoreCase("DIYARBAKIR"));//true
        System.out.println(city.equalsIgnoreCase("DiYaRbAkIr"));//true
        System.out.println(city.equalsIgnoreCase("Diiyarbakir"));//false-->one character is not matching
        System.out.println(city.equalsIgnoreCase("Diyarbakir "));//false

        if (city.equals("DIYARBAKIR")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals () false"); // it is going to be FALSE because equals () is case sensitive
        }

        if(city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equalsIgnoreCase() true");
        }else {
            System.out.println("equalsIgnoreCase() false");
        }


    }
}
