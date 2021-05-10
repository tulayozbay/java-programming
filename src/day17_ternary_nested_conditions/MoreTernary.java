package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {

        int hourlyRate = 50;
        //String reply;
        //if(hourlyRate > 45) {
        //  reply = "accept";
        //   } else {
        //   reply = "reject";
        // }

        String reply = (hourlyRate >= 50) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "Yes, Have DL, Can Drive" : "No, No DL, cannot drive";
        System.out.println("driving = " + driving);




    }
}
