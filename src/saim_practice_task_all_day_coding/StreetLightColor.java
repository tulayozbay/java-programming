package saim_practice_task_all_day_coding;
/*
[Street light]

You are at a street line. The color of the street line will determine what you should do.

    Green light - Print "Go"
    Yellow light - Print "Slow down"
    Red light - Print "Stop"
 */
public class StreetLightColor {
    public static void main(String[] args) {
        String lineColor = "Green";
        if (lineColor.equals("Green")){
            System.out.println("Go");
        }if (lineColor.equals("Yellow")){
            System.out.println("Slow down");
        } if (lineColor.equals("Red")){
            System.out.println("Stop");
        }

        }
}
