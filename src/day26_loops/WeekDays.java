package day26_loops;

public class WeekDays {
    public static void main(String[] args) {
        /**
         * int d = 2;
         *
         *         switch (d) {
         *             case 1:
         *                 System.out.println(d + " - Monday");
         *                 break;
         *             case 2:
         *                 System.out.println(d + " - Tuesday");
         *                 break;
         *             case 3:
         *                 System.out.println(d + " - Tuesday");
         *                 break;
         *             case 4:
         *                 System.out.println(d + " - Tuesday");
         *                 break;
         *             case 5:
         *                 System.out.println(d + " - Tuesday");
         *                 break;
         *             case 6:
         *                 System.out.println(d + " - Tuesday");
         *                 break;
         *             case 7:
         *                 System.out.println(d + " - Tuesday");
         *                 break;
         *
         *             }
         */

        //iste loop bizi boyle uzun uzadiya yazmaktan kurtarir.

        for (int day = 1; day <= 10 ; day++) {

            //IF WE DO NOT HAVE BREAK; IT WILL KEEP PRINTING. EVEN IF OUR VALUE 1.

            switch (day) {
                case 1:
                    System.out.println(day + " - Monday");
                    break;
                case 2:
                    System.out.println(day + " - Tuesday");
                    break;
                case 3:
                    System.out.println(day + " - Wednesday");
                    break;
                case 4:
                    System.out.println(day + " - Thursday");
                    break;
                case 5:
                    System.out.println(day + " - Friday");
                    break;
                case 6:
                    System.out.println(day + " - Saturday");
                    break;
                case 7:
                    System.out.println(day + " - Sunday");
                    break;
                default:
                    System.out.println(day + " no such day, it is java day");
                    break;

            }


        }

    }



}
