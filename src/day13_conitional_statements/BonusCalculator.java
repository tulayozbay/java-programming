package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 5000.0;

        if (salesAmount <= 2000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50.0; //conditional value assignment
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100.0;
        }

        System.out.println("Your total bonus : $" + bonus);

    }
}