package day06_arithmetic_operators;
/*
Please calculate all in car in the parking lot.
 */
public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas = 233;
        byte vws = 2;
        int teslas = 20;
        byte nissans = 1;
        int bmws = 155;
        int totalCarsInParking = toyotas + hondas + vws + teslas + nissans + bmws;

        System.out.println("Total car in the parking lot is " + totalCarsInParking);

        System.out.println("There are " + totalCarsInParking + " cars in the parking lot.");

        String pizza = "hawanian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        // there are 2 slices per person
        System.out.println("There are " + slicesPerPerson + " slices per person");
        //We ordered hawanian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, " + people + " people ate "+ slicesPerPerson + " slices each.");


    }
}
