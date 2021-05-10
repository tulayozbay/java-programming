package day39_wrapper_class;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        //auto- boxing : primitive
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;//234--> it doe not has boxing. you can testas a below
        //234. yanina nokta koydugumuzda eger bir menu cikmiyorsa box yoktur


        //Un-boxing: object > primitive
        Double d1 = new Double(100.5);
        double d2 = d1;
        double d3 = new Double(345.3);

    }
}
