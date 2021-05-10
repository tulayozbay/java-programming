package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(7);
        count(2);
        int num2 = 95;
        count(num2);

        String word = "wooden spoon";
        count(word.length());//count(12);--> because word length is 12--> word length give us number it is ok to use with int

        getAge(1988);
        int yearDelivered = 2021;
        getAge(yearDelivered);

    }

    public static void count(int num){
        for (int i = 0; i <= num; i++){
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void getAge(int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Birth year: " + birthYear + "   Age: " + age);

    }


}
