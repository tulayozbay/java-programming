package day24_loops;

/*
add new class YouTubeCatVideo
main method

"starting: World's smallest cat 🐈- BBC"

int seconds = 0;

video is 1 min 57 seconds

while we did not reach to last second
    print " Watching YouTube video: second: 1"


print "Finished watching Cat video, lets start another one"
 */

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat 🐈- BBC");
        int seconds = 0;//video start 0 second

        while (seconds <= 117){
            System.out.println("Watching cat 🐈 at second: " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching cat 🐈 video, lets start another one");

    }
}
