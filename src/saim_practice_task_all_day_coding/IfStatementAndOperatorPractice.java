package saim_practice_task_all_day_coding;

public class IfStatementAndOperatorPractice {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + a-- + a * 2 + a + ++a;
        System.out.println("a = " + a);//6
        System.out.println("b = " + b);//32

        int c= 200;
        int d = -c++ + - --c * c-- % 2 + c;

        System.out.println("c = " + c);//199
        System.out.println("d = " + d);//-1

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;

        System.out.println("x = " + x);//300
        System.out.println("y = " + y);//400
        System.out.println("z = " + z);//-119300


    }
}
