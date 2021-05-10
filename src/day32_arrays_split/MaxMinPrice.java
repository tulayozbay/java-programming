package day32_arrays_split;

import java.util.*;

//find and print details of most expensive item
//find and print details of least expensive item
        /*
        PSEUDOCODE;
        Declare;
        double maxPrice = price of first item
        int indexOfMaxPrice = index of firs item - 0
        LOOP STARTS FOR prices array
        if price [i] is more than maxPrice
        change maxprice to price[i]
        set indexOfMaxPrice to [i]
        END FOR LOOP
        Print items[indexOfMaxPrice] + prices[indexOfMaxPrice] + itemIDs[indexOfMaxPrice]
         */

public class MaxMinPrice {
    public static void main(String[] args) {
        //          index number-->  0         1        2          3         4           5
        String[] items  = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad",   "iphone 12 case" };
        double[] prices = {99.99,    150.0,    9.99,     250.0 ,    439.50,   39.99};
        int[] itemIDs =   {12345 ,   12346,    12347,    12348,     12349,    12350};

        //print array values as String, in same line, with no loop
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        System.out.println("---1) find and print details of most expensive item---");
        double maxPrice = prices[0];//assume first price is max
        int indexOfMaxPrice = 0;//assume max price is at index 0

        for (int i = 0; i < prices.length; i++){
            if (prices[i] > maxPrice){//find the price bigger than maxPrice
                maxPrice = prices[i];//once you find it assign maxPrice to price[i]
                indexOfMaxPrice = i;
            }
        }
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println(prices[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" + itemIDs[indexOfMaxPrice]);





    }
}
