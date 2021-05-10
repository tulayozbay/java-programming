package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {

    public static void main(String[] args) {
        // declare arraylist alt or option + enter for importing
        ArrayList <String> cities = new ArrayList<>();
        //add cities to arraylist --> we will use add method
        cities.add("Washington DC");//index 0
        cities.add("New York");//index 1
        cities.add("Vienna");//index 2
        cities.add("Adana");//index 3
        cities.add("LA");//index4
        //add Ashgabat to fist index
        cities.add(0,"Ashgabat");//bunu first index olarak alacak. ayrica bu tipler overloaded method olarak gecer. because diffrent type of data
        System.out.println(cities);
            //[Ashgabat, Washington DC, New York, Vienna, Adana, LA]

        //print firs and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));//it is ok but not dynamic.
        //find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));

        //print count of items in arraylist
        System.out.println("Count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities in the list.");

        //for loop and print all values in same line
        for (int i = 0; i < cities.size(); i++) { // eger sehirleri yarisina kadar print yapmak istersen sadece i < cities.size()/2;
            //bunu yapman gerekir
            System.out.print(cities.get(i) + " ");//Ashgabat Washington DC New York Vienna Adana LA

        }
        System.out.println();//bunu line biraksin diye yapiyoruz cunku yukarida println yerine print oldugu icin

        //for each loop
        for (String city : cities) {
            System.out.print(city + " ");//Ashgabat Washington DC New York Vienna Adana LA
        }
        System.out.println();

        //delete item from arraylist
        //2 ways we can remove
        //1) remove using index--> delete value at index 3
        cities.remove(3);
        //2)remove using object/value
        cities.remove("New York");

        System.out.println("after remove print cities = " + cities);//after remove print cities = [Ashgabat, Washington DC, Adana, LA]

        //delete/remove everything on the list
        cities.clear();

        //make sure it is clear
        //1)print/spit it out
        System.out.println("cities = " + cities);//cities = []
        //2) USing isEmpty
        if (cities.isEmpty()){
            System.out.println("List is empty.");
        }
        //3)check size()==0
        if (cities.size() == 0){
            System.out.println("List is empty.");
        }





    }

}
