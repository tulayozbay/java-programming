package saim_practice_task_all_day_coding;

import java.util.Scanner;

/*
[Baking contest]

You are in a baking contest. Your cookies will be rated by 3 judges. The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.

Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

If your score is more than both of the other people then print "First place!"
If your score is more then one other person then print "Second place"
If your score is less than both of the other people then print "Third place"
 */
public class BakingContest {
    public static void main(String[] args) {
        int judge1 = 5;
        int judge2 = 5;
        int judge3 = 5;
        int myScore = (judge1 + judge2 + judge3) / 3;
        int person1 = 6;
        int person2 = 7;

        if (myScore > person1 && myScore > person2){
            System.out.println("First place!");
        } else if (myScore > person1 || myScore > person2){
            System.out.println("Second place!");
        }else {
            System.out.println("Third place!");
        }

        //saimin yaptigi yol
        Scanner input = new Scanner(System.in);
        int judge = 1;
        System.out.println("Enter judge " + judge++ + " score");
        int scoreOne = input.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int scoreTwo = input.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int scoreThree = input.nextInt();
        System.out.println("Enter other person 1's score");
        int otherPerson1 = input.nextInt();
        System.out.println("Enter other person 2's score");
        int otherPerson2 = input.nextInt();

        int ourAverageScore = (scoreOne + scoreTwo + scoreThree) / 3;

        if(ourAverageScore > otherPerson1 && ourAverageScore > otherPerson2) {
            System.out.println("First place");
        } else if( (ourAverageScore > otherPerson1 && ourAverageScore < otherPerson2) || (ourAverageScore < otherPerson1 && ourAverageScore > otherPerson2) ){
            System.out.println("Second place");
        } else {
            System.out.println("Third place");
        }



    }
}
