package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;// this is long way
        System.out.println("cars in parking lot = " + cars);
        cars += 5;// this is short way it is called SHORT HAND OPERATORS
//        cars =+ 5;// f write like this computer not add it. comp. thinking this is only pozitif number but not adding.
        System.out.println("cars in parking lot = " + cars);

        //6 cars left in parking lot
        cars -= 6;
        System.out.println("cars in parking lot = " + cars);

        //1 car left
        cars = cars - 1; //long way
        cars -= 1;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        //How many cars in parking lot
//        cars = cars + electricCars;//long way
        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word = word + " programming";//long way
        //add " is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;//it is string but it is okay to add number. no double quote when you assign the number of String.
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter); //output:A because of the ASCII
        letter += 3;
        System.out.println("letter = " + letter); //output:D because of the ASCII
        //add 'J' to letter
        letter += '1';
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird fee is 50 off
        parkingFee /= 2; //shorthand operator
//        parkingFee = parkingFee / 2; //long way
        System.out.println("early bird parking fee = " + parkingFee);

        //weekend parking is free
        parkingFee -= parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);







    }
}
