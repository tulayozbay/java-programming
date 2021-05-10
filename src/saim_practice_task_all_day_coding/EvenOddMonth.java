package saim_practice_task_all_day_coding;

public class EvenOddMonth {
    public static void main(String[] args) {
        int monthNumber = 4;
        if (monthNumber % 2 == 0 && monthNumber <= 12){
            if (monthNumber == 2){
                System.out.println("28 days");

            } if (monthNumber > 2){
                System.out.println("30 days");
            }

        }else if (monthNumber % 2 == 1 && monthNumber < 13)
            System.out.println("31 days");
    }
}
