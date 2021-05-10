package day16_switch_ternary;

/**
 * Add new class CappuccinoBuyer
 * main method
 *
 * declare
 * price    ->
 * calories ->
 * size could be "tall", "grade" ,"venti"
 *
 * when size = "tall"
 *     print "Tall Cappuccino please"
 *     price    ->  3.69
 *     calories ->  90
 *
 * when size = "grade"
 *     print "Grande Cappuccino please"
 *     price    ->  3.99
 *     calories ->  120
 *
 * when size = "venti"
 *     print "Venti Cappuccino please"
 *     price    ->  4.29
 *     calories ->  150
 *
 * any other size:
 *     print "We do'nt serve that size of Cappuccino"
 *
 *
 * print "Total price: $3.69"
 *       "You will consume 90 cal of energy"
 */
public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0.0;
        int calories = 0;

        switch (size) {
            case "tall":
                System.out.println(size + " cappuccino please ");
                price = 3.69;
                calories = 90;
                break;
            case "grade":
                System.out.println("Grade cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Venti cappuccino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don't serve that " + size + " Cappuccino");

        }

        System.out.println("Total price: " + price);
        System.out.println("You will consume " + calories + " cal of energy");

    }
}
