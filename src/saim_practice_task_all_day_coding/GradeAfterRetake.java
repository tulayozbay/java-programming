package saim_practice_task_all_day_coding;

/*
[If statements, operators]

Write a program that will give the grade after the retake. The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
 */

public class GradeAfterRetake {
    public static void main(String[] args) {
        int baseGrade = 90;
        int numberOfAttempts = 1;
        int retakePenalty = 0;

        if (numberOfAttempts == 1){
            retakePenalty = (int)(baseGrade *0.10);
        }else if (numberOfAttempts == 2){
            retakePenalty = (int)(baseGrade * 0.20);

        }else if (numberOfAttempts == 3){
            retakePenalty = (int) (baseGrade *0.35);
        }
        System.out.println("Grade after retake attempt " + numberOfAttempts + " was: " + (baseGrade - retakePenalty));

    }
}
