package saim_practice_task_all_day_coding;

/*
If statements, operators]

Write a program that will accept your salary amount. Then also ask the user if they are full time or not (boolean).
 If they are fulltime add 20000 to their salary, but if they are part time then subtract 5000. Print the final salary.
 */

public class SalaryFulltimeParttime {
    public static void main(String[] args) {
        int salary = 150000;
        boolean isFullTime = true;
        if (isFullTime){
            salary += 20000;
        } if (!isFullTime){
            salary -= 5000;
        }
        System.out.println("Final salary: " + salary);
    }
}
