package day16_switch_ternary;

/*
add new class AdaireApartments
main method

#### WELCOME TO ADAIRE APARTMENTS ####

numberOfBedrooms = 0, 1, 2

startingPrice = 0;

when numberOfBedrooms 0:
    print: "Studio apartment selected"
    startingPrice -> 1454

when numberOfBedrooms 1:
    print: "One bedroom apartment selected"
    startingPrice -> 1725

when numberOfBedrooms 2:
    print: "Two bedroom apartment selected"
    startingPrice -> 2899

------
"Starting price $1454"
 */

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("********** WELCOME TO ADAIRE APARTMENTS **********");

        byte numberOfBedrooms = 0;
        double startingPrice = 0.0;

        switch (numberOfBedrooms) {
            //WE CAN PUT DEFAULT STATEMENT HERE TOO. IT DOESN'T MATTER END OR BEGINNING.

            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.99;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("teo bedroom apartment selected");
                startingPrice = 2899.0;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedrooms not available");
                break;//put or not you are fine.
            //  return; //if we put this instead of break it won't print the last thing after statment
            //it wot print --> System.out.println("Starting price = $" + startingPrice);

//            return; meaning is EXIT MAIN METHOD

        }

        System.out.println("Starting price = $" + startingPrice);
    }
}
