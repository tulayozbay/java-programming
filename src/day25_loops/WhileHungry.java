package day25_loops;

/*
add new package day25_loops
    add new class WhileHungry

    boolean isHungry = true;
    int bananas = 0;
    int countToFull = 3;

    it takes 3 bananas for isHungry to be set to false

    while hungry
        eat banana 1

        when bananas reaches countToFull
            set hungry to false

        increase banana by 1
 */

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry= true;
        int bananas = 0;
        int countTOFull = 3;

        //bu da baska bir yol
      //  while (isHungry && bananas !== countTOFull)

                //1.yol
        while (isHungry) {
            bananas++;
            System.out.println("Eat banana: \uD83C\uDF4C " + bananas);

            //2.yol
         //   isHungry = bananas == countTOFull ? false : true;

           if (bananas == countTOFull) {
                isHungry = false;
        }

        }

        System.out.println("Had enough bananas. Lets get back to studying");
    }
}
