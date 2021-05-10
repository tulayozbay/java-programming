package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12; // the best way to calculate monthly pay//weeklyPay*4; -> might not be accurate.
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly pay: " + weeklyPay); //concetination
        System.out.println("Monthly Pay: " + monthlyPay);
        System.out.println("Annual Pay: " + annualPay);
    }
}
