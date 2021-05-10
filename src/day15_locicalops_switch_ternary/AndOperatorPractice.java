package day15_locicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";


//if (onSale==true && freeShipping==trye) {// we can do this but it is not necessary because already assign boolean in above.
        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);
        }

        //add to cart only when it is freeShipping, onSale and itemName is "Wooden Spoon"
        if (freeShipping && onSale && itemName.equals("Wooden Spoon")) {
            System.out.println("Adding to cart - " + itemName);
        } else{
            System.out.println("Continue shopping for good deals on - " + itemName);
        }



    }

}
