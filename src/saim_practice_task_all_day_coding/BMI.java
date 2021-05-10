package saim_practice_task_all_day_coding;
/*
BMI: Program will ask user to enter their mass (kilogram) and their height (meters).
Calculate their BMI and then print the appropriate message based on the provided values:
All numbers taken as doubles
—> BMI Formula: BMI = mass / height^2
—> Values:
Less than 18.5 — Underweight
From 18.5 to 25 — Normal weight
From 25 to 30 — Overweight
More than or equal to 30 — Obese
 */
public class BMI {
    public static void main(String[] args) {
        double mass = 90.7;
        double height = 1.58;
        double bMI = mass / height * height;

        if (bMI < 18.5){
            System.out.println("Underweight");
        }else if (bMI >= 18.5 && bMI < 25){
            System.out.println("Normal weight");
        }else if (bMI >= 25 && bMI < 30){
            System.out.println("Over weight");
        } else {
            System.out.println("Obese");
        }
    }
}
