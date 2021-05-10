package saim_practice_task_all_day_coding;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Movie {
    public static void main(String[] args) {
        String name = "Catch me if you can";
        String genre = "comedy and drama";
        String duration = " 2 hours 21 minutes";
        String releaseDate = "December 16, 2002";
        String rating = "PG-13";
        boolean isSequel = false;
        int rottenTomatoesRating = 96;
        boolean isOnDVD = true;

        System.out.println("----- WELCOME TO ADAR'S CINEMA -----");
        System.out.println("Tonight we are streaming "+ name + " which was released on " + releaseDate);
        System.out.println("This " + genre + " movie got a %" + rottenTomatoesRating + " rating on Rotten Tomatoes");
        System.out.println("The rating is " + rating + " and it runs for " + duration);
        System.out.println("This is a sequel - " + isSequel + " and is on dvd - " + isOnDVD);

    }
}
