package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " +shoppingList.size());
        System.out.println("isEmpty? = " +shoppingList.isEmpty());//true
        if (shoppingList.isEmpty()){//isEmpty is a method . It checks the size.
            System.out.println("List is empty. Keep coding Java.");
        } else {
            System.out.println("List is not empty, code java then go to the mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        System.out.println("Shopping List : " + shoppingList);

        if (shoppingList.isEmpty()){//isEmpty is a method . It checks the size.
            System.out.println("List is empty. Keep coding Java.");
        } else {
            System.out.println("List is not empty, code java then go to the mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = (Arraylist size) = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));
        if (shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        } else {
            System.out.println("Shoes is not in the list");
        }
        System.out.println("Buying shoes...$80");

        shoppingList.remove("shoes");

        System.out.println("Shopping List = " + shoppingList);//remove shoes from the shoppingList

        System.out.println("done shopping, get back to coding");
        shoppingList.clear();//clear the list, remove all times
        System.out.println(shoppingList);

    }
}
