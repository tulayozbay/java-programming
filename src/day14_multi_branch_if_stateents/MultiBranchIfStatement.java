package day14_multi_branch_if_stateents;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int day = 3;

        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("Not Monday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
        }
        if (day == 3) {
            System.out.println("Wednesday");
        }

        // we can also coding as buttom

        System.out.println("========== MULTI BRANCH IF STATEMENT ==========");
        day = 1;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesdar");
        } else {
            System.out.println("Java Day!");
        }

        System.out.println("Everyday code java!");
    }
}