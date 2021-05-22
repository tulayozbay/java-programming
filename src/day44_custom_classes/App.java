package day44_custom_classes;

/**
 * App class is used as a templete for App objects-->App objects is in MyApp class
 * We are describing app properties and behaviour here. Objects will be able to use them
 */

public class App {
    //data/ variables
    String name;//null by default
    double version;//0.0 by default
    // if you not sign both variables it show as up null and 0.0 by default
    //open method is using name and version
    public void open(){//it returns void--> this is a behaviour
        //most of the time we can use our data in our behaviour
        System.out.println("opening "+ name + " app - version = " + version );
    }
}
