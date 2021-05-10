package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0,"Jeep");
        myCars.add(1,"Lada");
        myCars.add(2,"Yugo");

        System.out.println(myCars.toString());//toString is not necessary. It is going to print same thing with it or not.
        //Ancak asagidaki ornekte oldugu gibi tum arabalri bir yere store etmek istersek mecburen to.String olayini kullanmaliyiz
        String allCarsIn1St = myCars.toString();//saves all cars in 1 string variable//we stored arralist to single string

        System.out.println("allCarsIn1St = " + allCarsIn1St);

        //change index 0 to Lamborghini
        myCars.set(0,"Lamborghini");

        System.out.println("after set = " + myCars);//[Lamborghini, Lada, Yugo, Toyota, Mazda, Ford, Moskvich, Tesla]-->Internally uses toString you do not have to put there

        //Change index 4 to Honda
        myCars.set(4,"Honda");
        System.out.println("after set index 4 to Honda = " + myCars);//after set index 4 to Honda = [Lamborghini, Lada, Yugo, Toyota, Honda, Ford, Moskvich, Tesla]

        /**
         * How would you do that if myCars was array:
         * myCars[4]="honda';
         */

        //find the index number of "Ford"
        /**
         String str = "java";
         str.indexOf("v");
         */
        System.out.println("index of Ford = " + myCars.indexOf("Ford"));
        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change Moskvich to Jiguli
        myCars.set(moskvichIndex , "Jiguli");
        System.out.println("Set Moskvich to Jiguli and print = " + myCars);//Set Moskvich to Jiguli and print = [Lamborghini, Lada, Yugo, Toyota, Honda, Ford, Jiguli, Tesla]

        //replace Ford with Trabant using single statement
        //IndexOf("Ford), "Trabant"
        int FordIndex = myCars.indexOf("Ford");
        myCars.set(FordIndex, "Trabant");
        System.out.println("After set to Trabant = " + myCars);
        //System.out.println(myCars.set(myCars.indexOf("Ford"),"Trabant"));-->ikinci yol

        //check Lada if it is there and then replace it with Bugatti if it is there
//preventing error
        /*
        If myCars contains "Lada"
            find index of Lada and set vaur to Bugatti
         else
            print "Lada is not found"
         */

        if (myCars.contains("Lada")){
            myCars.set(myCars.indexOf("Lada") , "Bugatti");
        } else {
            System.out.println("Lada is not found.");
        }
        System.out.println("After set Bugatti = " + myCars);

        /**
         * Lamborghini -->  Prius
         * Toyota --> Lexus
         * Trabant -->Audi
         * We will use for loop
         */
        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")){
                //change to Prius
                myCars.set(i, "Prius");
            }else if (myCars.get(i).equals("Toyota")){
                myCars.set(i, "Lexus");
            }else if (myCars.get(i).equals("Trabant")){
                myCars.set(i, "Audi");
            }
        }
        System.out.println("After loop = " + myCars);






    }
}
