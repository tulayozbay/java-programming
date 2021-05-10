package saim_practice_task_all_day_coding;

/*
[Oxygen level - If statements, operators]

You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
x
> Above 90 - Your tank is full
> Above 80 - Still okay
> Above 70 - Don't go too far
> Above 60 - Start to head back
> Above 50 - Be careful now you at at 50%
 */
import java.util.Scanner;

public class OxygenLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int o2Level = input.nextInt();

        if (o2Level > 90){
            System.out.println("Your tank is full");
        }if (o2Level > 80){
            System.out.println("Still okay");
        }if (o2Level > 70){
            System.out.println("Don't go too far");
        }if (o2Level > 60){
            System.out.println("Start to head back");
        }if (o2Level > 50){
            System.out.println("Be careful now you at at 50%");
        }else  {
            System.out.println("Your tank is almost empty . Please go back to station.");
        }

    }
}
