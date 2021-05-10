package day38_methods;
/*
ptint 1 -100 without loop
this is interview question
yes we can do with recursive method
 */
public class RecursiveMethod {
    public static void main(String[] args) {
        printNums(1);
    }

    public static void printNums(int num){
        System.out.print(num + " ");
        num++;
        if (num <= 100) {
            printNums(num);
        }
    }

}
