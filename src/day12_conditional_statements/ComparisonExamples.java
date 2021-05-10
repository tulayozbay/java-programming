package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 4_5;//45
        int speedLimit = 5_5;//55
        System.out.println(currentSpeed > currentSpeed);//false->45 NOT MORE 55
        System.out.println(speedLimit < currentSpeed);//false-> 55 NOT LESS 45
        System.out.println(speedLimit == currentSpeed);//false 55 nOT EQUAL TO 45

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " +isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        currentSpeed += 20;//65 -> (45+20)

        isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding? - " +isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        double accountBalance = 250.25;
        double itemprice = 300.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemprice));

        boolean canAfford = accountBalance >= itemprice;
        System.out.println("Can afford = " + canAfford);

        //ecrease balance by itemPrice. using shorthand operator
        accountBalance = accountBalance - itemprice;
        accountBalance -= itemprice;//this is shorthand operator for below example
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " + isBroke);



    }
}
