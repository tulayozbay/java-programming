package day09_scanner_practice;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate:");
        double hourlyRate = 54.5;//variables
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12; // the best way to calculate monthly pay//weeklyPay*4; -> might not be accurate.
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly pay: " + weeklyPay); //concetination
        System.out.println("Monthly Pay: " + monthlyPay);
        System.out.println("Annual Pay: " + annualPay);


    }
}
