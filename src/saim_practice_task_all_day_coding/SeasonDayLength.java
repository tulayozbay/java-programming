package saim_practice_task_all_day_coding;

/*
[Season & Day length]

The seasons will determine how long each day and night are.
The season will be determined by a number:

> 1 - Spring
day: 14
night: 10
> 2 - Summer
day: 16
night: 8
> 3- Fall
day: 14
night: 10
> 4 - Winter
day: 12
night: 12
 */
import java.util.Scanner;

public class SeasonDayLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int season = scan.nextInt();
        int day = 0; ;
        int night = 0; ;
        String seasonName = "";

        if (season == 1){
            day = 14;
            night = 10;
            seasonName = "Spring";

        }
        if (season == 2) {
            day = 16;
            night = 8;
            seasonName = "Summer";
        }
        if (season == 3) {
            day = 14;
            night = 10;
            seasonName = "Fall";
        }
        if (season == 4) {
            day = 12;
            night = 12;
            seasonName = "Winter";
        }
        System.out.println(seasonName + " is " + day + " days and " + night + " nights.");


    }
}
