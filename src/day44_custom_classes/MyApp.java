package day44_custom_classes;

/**
 * This class used
 */

public class MyApp {
    public static void main(String[] args) {
        //String app1 = "uber" this is string object. just characters
        App app1 = new App();//creating new object
        //i would like to see opening Uber app - version = 3.5
        app1.name = "Facebook";
        app1.version = 7.1;
        app1.open();//call open method using object variable

        app1.version = 4.0;
        app1.open();

    }

}
