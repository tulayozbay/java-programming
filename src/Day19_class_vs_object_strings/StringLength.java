package Day19_class_vs_object_strings;

public class StringLength {
    public static void main (String[] args){

        String name = "Adar";
        System.out.println(name.length());//length is going to show you ow many character in string variable adar has 4 character
        System.out.println("count: " + name.length());
        System.out.println("wooden spoon".length());
        String firstName = "Tulay";
        System.out.println(firstName + "-" + firstName.length());
        int count = firstName.length(); //length returns int value. length stored in count.
        System.out.println("count = " + count);

        String password = "abc123";

        if (password.length() >= 6){
            System.out.println("Valid amazon password");
        } else {
            System.out.println("Password must be at least 6 characters");
        }


    }
}
