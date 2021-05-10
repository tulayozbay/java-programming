package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand="Apple";
        String model="IphoneSE";
        String color="Black";
        double price=1064.99;
        int storage=128;
        boolean hasCamera=true;
        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasCamera);

        //With message -> Concatenation
        System.out.println("Brand is "+brand); // you should put space (if it is necessary) in the double quote.
        System.out.println("Model is "+model);
        System.out.println("Color is "+color);
        System.out.println("Price is $"+price);
        System.out.println("Storage is "+storage+"GB" );
        System.out.println("Has camera? \n- "+hasCamera);
    }
}
