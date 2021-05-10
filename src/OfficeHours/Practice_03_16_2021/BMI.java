package OfficeHours.Practice_03_16_2021;

/*
—> BMI Formula: BMI = mass / height^2
—> Values:
Less than 18.5 — Underweight
From 18.5 to 25 — Normal weight
From 25 to 30 — Overweight
More than or equal to 30 — Obese
 */

public class BMI {
    public static void main(String[] args) {
        double mass = 91;
        double height = 1.61;
        double BMI = mass / (height * height);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 25) { //cAN YOU DO THIS: 18.5 <=BMI <= 25 // no
            System.out.println("Normal weight");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Over weight");
        } else {
            System.out.println("Obese");
        }
    }
}
