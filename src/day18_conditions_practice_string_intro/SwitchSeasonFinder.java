package day18_conditions_practice_string_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 1;
        if(month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }

        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

        }
    }
}
