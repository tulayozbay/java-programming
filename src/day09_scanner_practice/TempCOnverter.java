package day09_scanner_practice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class TempCOnverter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("####### FAHRENHEIT TO CELSIUS #######");
        System.out.println("Enter Fahrenheit value:");
        double fahrenheitValue = input.nextDouble();
        double celsiusValue = (fahrenheitValue - 32) * 5/9;
        System.out.println(fahrenheitValue + " Fahrenheit = " + celsiusValue + " Celsius.");
    }
}
