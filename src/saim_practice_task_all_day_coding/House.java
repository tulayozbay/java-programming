package saim_practice_task_all_day_coding;

public class House {
    public static void main(String[] args) {
        String houseType = "Single House";
        int numberOfBedrooms = 3;
        double numberOfBathrooms = 2.5;
        byte numberOfKitchen = 1;
        boolean isThereBasement = false;
        boolean isAttic = true;
        boolean isPool = true;
        boolean isHouseForSale = true;
        double costOfHouse = 328.54;
        String address = "Darby creek Rd.";
        int zipCode = 40509;
        boolean isParkNearBy = true;
        byte schoolRating = 5;

        System.out.println("The house type is: " + houseType);
        System.out.println("The number of bedrooms is: " + numberOfBedrooms);
        System.out.println("The number of bathroom is: " + numberOfBathrooms);
        System.out.println("The number of kitchen is: " + numberOfKitchen);
        System.out.println("Is there a basement? : " +isThereBasement);
        System.out.println("Is there an attic? : " + isAttic);
        System.out.println("Is there a pool? : " + isPool);
        System.out.println("Is the house for sale? : " + isHouseForSale);
        System.out.println("Cost of the house: $" +costOfHouse);
        System.out.println("Address is: " + address);
        System.out.println("Zipcode is: " + zipCode);
        System.out.println("Is a park near by? : " + isParkNearBy);
        System.out.println("Rating of surrounding school district is: " + schoolRating + " (out of 5)");


    }
}
