package day04_variables_intro;

public class AmazonItem {
    public static void main(String[] args){
        String description="HIC wooden spoon";
        int ratingsCount=181; //used to int because it is whole number
        double price=5.99; // used to double because it is decimal number
       // int price=6;
        String seller="by Amazon.com";
        boolean prime=true;
        // String prime="yes";  -> also we can do like this too

        System.out.println("--- PRODUCT INFORMATION ---");
        System.out.println(description);
        System.out.print("* * * * *");  // pay attention we wrote print not the println
        System.out.println(ratingsCount);
        System.out.println(price);
    }
}
