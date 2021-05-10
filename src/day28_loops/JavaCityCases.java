package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for (int day = 1; day <= 30; day++) {
            if (totalCases % 7 == 0) {
                totalCases += 500;//this is for all sundays increase the case 500
            } else {
                totalCases += 200;//for all the other day increase 200 more cases
            }


            totalCases += 200;
            System.out.println("Day " + day + " | total cases: " + totalCases);

        }
        System.out.println("JavaCity 03/2021 Total cases: " + totalCases);

    }
}
