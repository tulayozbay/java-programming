package day35_methods_with_param;



public class Email {
    public static void main(String[] args) {
        buildEmail("tulay" , "cybertekschool");
        buildEmail("tulay ozbay 88", "gmail");
    }

    public static void buildEmail(String name, String domain){
        name = name.replace(" ", "_").toLowerCase();
        domain = domain.toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println(email);
    }
}
