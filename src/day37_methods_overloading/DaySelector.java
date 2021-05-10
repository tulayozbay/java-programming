package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));

        //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        //loop from 1 to 8 and call the getDayName with loop variable
        for (int i = 1; i <= 8 ; i++) {
            System.out.println(i + " = " + getDayName(i));
        }

        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //Store getDayName into variable, and print variable
        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if (someDay==null) {
            System.out.println("someDay is null for invalid day");
        }

        //---------------------------------------------------------
        System.out.println(getDayNameV2(5));

    }
    //-------------------------------------------------------------------------
    public static String getDayName(int day){

        //VERY IMPORTANT
        // when using switch statement inside the method, we cannot use return and break in same case.
        // reason is it will show Unreachable code error.
        //return "value"; --> means return the value also exit the method.
        //RETURN MORE POWERFUL THEN BREAK
        switch (day){
            case 1:
                return"Monday";//-->Bunu koydugumuzda ardindan sout ve break konulmaz. cunku bu zaten degeri verir
                // ve exit yapar breaka ihtiyac yoktur.
               // System.out.println("Monday");
               // break;--> Unreachable code, because return already exits the method.(yukaridakinin aynisi olan aciklama)
            case 2:
               return "Tuesday";
            case 3:
                return "Wednesday";
                //case 3: return "Wednesday";--> seklinde yan yana da yazilabilir.
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("ERROR: Invalid day - " + day);
              return null;//-->NULL meaning is no object, NOTHING
            //null is not same as ""(empty double quotes)
            //because "" is not a valid STRING OBJECT that has no characters
            //however null is NO OBJECT and no value
            //also NULL CAN ONLY BE ASSIGN NON PRIMITIVES / OBJECT TYPES

            //break;=>compiler showS error.You cannot put even if no put return null;
        }
    }

    //###########################################################################

    public static String getDayNameV2(int day){
        String dayName ;
        switch (day){
            case 1 :  dayName = "Monday"; break;//We can write as it is in same line
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;
        }
        return dayName;
    }

    //*********************************************************
}
