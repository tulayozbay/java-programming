package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible("Tulay", 751);
        checkEligible("Adar",815);
        checkEligible("Inan", 611);
        //System.out.println(checkEligible("Adar", 711));->ERROR-  cannot print VOID method
        System.out.println(getCreditScore());//asagidaki 800 degeri buraya gelmis olur-->Can print INT method
        System.out.println("Credit Score = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);
    }
    /**
     * BURADAKI INT IN ANLAMI:
     * IT IS RETURN TYPE--> IT MEANS METHOD WILL RETURN THE NUMBER
     * getCreditScore--> method name and no paramaters
     * return 800:--> whenever we return a value from a method(not void), you need to type RETURN keyword inside your method
     */

    public static int getCreditScore() {
        return 800;
    }


    public static void checkEligible (String name, int creditScore){

        if (creditScore >= 700){
            System.out.println(name + " You are eligible for leasing this car");
        } else {
            System.out.println(name + " Sorry! You are not eligible");
        }
    }





}
