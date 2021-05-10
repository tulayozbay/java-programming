package day18_conditions_practice_string_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 50;

        if(score >= 1 && score <= 40) {
            System.out.println("Grade D = " + score);
        } else if(score >= 41 && score <= 60) {
            System.out.println("Grade C = " + score);
        } else if(score >= 61 && score <= 90) {
            System.out.println("Grade B = " + score);
        } else if(score >= 91 && score == 100) {
            System.out.println("Grade A = " + score);
        } else {
            System.out.println("Invalid score");
        }
    }
}
