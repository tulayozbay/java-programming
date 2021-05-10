package day34_void_methods;
/*
    seatInCar
    startTheCar
    shiftToDrive
    pressGasPedal
 */
public class StartChipCar {
    public static void main(String[] args) {
        //print yaparken buradaki call method sirasina bakarak print yapar
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    public static void pressGasPedal(){
        System.out.println("4. Hold steering wheel with 2 hands and press gas pedal");
    }

    public static void seatInCar(){//method name start with lowercase
        System.out.println("1. Open the door and seat n driver seat");
    }//Ayriva bu sekilde de yazilir.

    public static void startTheCar(){
        System.out.println("2. Insert key to ignition and turn clockwise");
    }

    public static void shiftToDrive(){
        System.out.println("3. Press brake pedal and shift to 'D'");
    }



}
