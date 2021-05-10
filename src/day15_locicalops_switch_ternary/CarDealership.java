package day15_locicalops_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Toyota";
        double carPrice = 8999.0;

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla") ) ) {
            //OR larin hepsini paranteze al.
            System.out.println("Ready to purchase model = " + model + ", price =  " + carPrice);
        } else {
            System.out.println("Not interested in model = " + model + ", price = " + carPrice);
        }
    }
}
