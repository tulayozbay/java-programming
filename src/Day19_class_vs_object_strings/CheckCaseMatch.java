package Day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "usa";
        if (countryCode.equals(countryCode.toUpperCase())){//eger countryCode esit ise uppercaseli haline  demek burasi
            System.out.println("Pass - case is correct");
        } else {
            System.out.println("Fail - case is incorrect");
        }
    }
}
