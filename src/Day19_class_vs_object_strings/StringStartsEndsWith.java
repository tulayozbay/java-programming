package Day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));//true
        System.out.println(word.startsWith("in"));//true
        System.out.println(word.startsWith("intellij"));//true
        System.out.println(word.startsWith("intellij idea"));//true
        System.out.println("java".startsWith("j"));//true
        System.out.println(word.startsWith("Int"));//false-->case sensitive

        System.out.println(word.endsWith("idea"));//true
        System.out.println(word.endsWith("a"));//true


        String name = "Adar";
        if (name.endsWith("r")) {
            System.out.println("Maybe, it is a female name");
        }

        /**
         * Mr.-->Man
         * Dr.-->Doctor
         * Mrs.-->Married woman
         * Ms.-->Single woman
         * Sr.-->Senior
         * Jr.-->Junior
         */

        String firstName = "Dr. Nadir";

        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("Normal name");
        }

        /**
         * String url = "htts://www.stackoverflow.com"
         * .com -> "Commercial website"
         * .ru -> "Russian website"
         * .gov -> "Government website"
         * .edu -> "Education website"
         * .org -> " Organization website"
         */

        String url = "htts://www.stackoverflow.com";

        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }




    }
}
