package day05_primitives_concatanation;

public class WatchInfo {
    public static void main(String[] args){
        String brand="Bulova";
        String color="Brown";
        double price=4600.0;
        boolean waterResistant=true;
        boolean isSmart=false;
        char gender='F';
        System.out.println("Brand                : "+brand);
        System.out.println("Color                : "+color);
        System.out.println("Price                : $"+price);
        System.out.println("Has water resistant? : "+waterResistant);
        System.out.println("Is it smart?         : "+isSmart);
        System.out.println("Gender               : "+gender);

        String brand2 = "Chopard";
        String color2 = "Gold";
        double price2 = 4600.0;
        boolean waterResistant2 = true;
        boolean isSmart2 = false;
        char gender2 = 'F';

        System.out.println("BRAND: \t\t\t\t" + brand2);
        System.out.println("COLOR: \t\t\t\t" + color2);
        System.out.println("PRICE: \t\t\t\t" + "$" + price2);
        System.out.println("WATER RESISTANT?: \t" + waterResistant);
        System.out.println("IS A SMART WATCH?: \t" + isSmart2);
        System.out.println("GENDER: \t\t\t" + gender2);

        System.out.println("Watch brand\t\t\t"+brand2+"\n"+"Color\t\t\t\t"+color2+"\n"+
                "Price\t\t\t\t"+price2+"\n"+"Water resistant\t\t"+waterResistant2+"\n"+"Is smart\t\t\t"+isSmart2+"\n"+
                "Gender\t\t\t\t"+gender2);


    }
}
