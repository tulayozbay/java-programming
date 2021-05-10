package day37_methods_overloading;
/*
method:
    loginVoid
params:
    String username, String password

return type:
    VOID

in the method:
    Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"

if(both match)
    PRINT:
        Login Successful, welcome cybertekStudent
ELSE
    PRINT:
        Incorrect username or password
 */
public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123");//this is POSITIVE TEST
        //we can say SUNNY DAY instead of POSITIVE TEST-->it means everything is successful
        loginVoid("cybertek", "answer");//NEGATIVE TEST / RAINY DAY SCENARIO
        loginVoid("", "");
//        .System.out.println(loginVoid("cybertekStudent", "abc123"));-->ERROR-VOID- no return the value

        //---------------------------------------------------------------------------------------

        System.out.println(login("cybertekStudent", "abc123"));

        if (login("cybertekStudent", "abc123")) {
            System.out.println("Login Successful, welcome CybertekStudent");
            System.out.println("Select to course to continue.");
        }else{
            System.out.println("Incorrect username or password");
        }

        boolean isLoginSuccess = login("nadir", "mountain");//false
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if (login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, selectt course or calendar");
        }else{
            System.out.println("Something wrong. Please try again!");
        }

    }

    //-------------------------------------------------------------------------------

    public static void loginVoid (String userName , String password){
       //void meaning is does not return the value
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            //bu sekilde yapilabilir.cunku usernameler genelde buyuk kucuk harf farketmeksizin yazildiginda kabul edilir.
            System.out.println("Login Successful, welcome CybertekStudent");
        }else{
            System.out.println("Incorrect username or password");
        }

    }

    //---------------------------------------------------------------------------------------

    public static boolean login(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

//        return (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword));-->bu kisa yolla yaptigimizda
        //asagidakilerini yapmaya gerek yoktur.

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            return true;
        }else{ //burada BU ELSE STATEMENT I SILEBILIR SADECE RETURN FALSE KISMINI BIRAKABILIRI.
            //when we deleted else block return true and exit method here. return false will not run.
            return false;
        }


    }

    //--------------------------------------------------------------------------------------------
}
