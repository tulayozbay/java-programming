package saim_practice_task_all_day_coding;

/*
create a class named Apartment
create a main method

    Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers,
        allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner,
        is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning,
        number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

 */

public class Apartment {
    public static void main(String[] args) {

        String address, nameOfOwner, phoneNumber, reviewStars;
        address = "421 Darby Creek Rd. Lexington, KY -40509";
        nameOfOwner = "Jay Mitchell";
        phoneNumber ="859-314-2811";
        reviewStars = "****";
        int numberOfUnits, averageSizeOfUnit, monthlyRent, lengthOfLease, totalResident, floorsNumber, parkingSpaces;
        numberOfUnits = 125;
        averageSizeOfUnit = 1100;
        monthlyRent = 1500;
        lengthOfLease = 12;
        totalResident = 280;
        floorsNumber = 4;
        parkingSpaces = 2;
        boolean isW_D, allowsPet, hasPool, isNearGasStation, hasABasement, hasAvailableUnits, hasAirConditioner, hasWheelChair;
        isW_D = true;
        allowsPet = false;
        hasPool = false;
        isNearGasStation = true;
        hasABasement = false;
        hasAvailableUnits = true;
        hasAirConditioner = true;
        hasWheelChair = false;

        int rentAfter3Years = monthlyRent - (monthlyRent / 10);
        int rentAfter6Years = monthlyRent - (monthlyRent / 5);
        int AverageResidentPerUnit = totalResident / numberOfUnits;
        int parkingSpotPerUnit = parkingSpaces / numberOfUnits;
        int averageUnitsPerFloor = numberOfUnits / floorsNumber;



    }
}
