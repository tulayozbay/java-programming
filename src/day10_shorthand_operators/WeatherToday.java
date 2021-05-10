package day10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("how is the weather today?");
//        String weather = "sunny";-> HARD CODE
//        String weather = scan.next();// next()-> only accepts String until first space.if you write really cold it is only print really.
//        nextLine();-> accepts String of many words, whole line until we press ENTER/new line.
        String weather = scan.nextLine();
        System.out.println(weather + " - is a nice day today!");
    }
}
