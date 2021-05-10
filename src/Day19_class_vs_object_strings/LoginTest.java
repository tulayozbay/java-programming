package Day19_class_vs_object_strings;



/**
 * PSEUDOCODE
 * add new class LoginTest
 * main method
 *
 * expUserName = "cybertek"
 * expPassword = "Abc123"
 *
 * userName = "CYBERTEK"
 * password = "Abc123"
 *
 * userName is not case sensitive
 * password is case sensitive
 *
 * WHEN expUserName equals userName AND expPassword equals password
 *     -> "Pass - user successfully logged in"
 *
 * OTHERWISE:
 *     WHEN expUserName NOT equals userName
 *         -> "Incorrect Username"
 *     OTHERWISE:
 *         -> "Incorrect password"
 */


class LogInTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "Cybertek123";
        String password = "abc1234";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user logged in successfully ");
        }else {
            System.out.println("Fail - login failed");
        }


        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user logged in successfully ");
        }else {
            if(!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - username is incorrect");
            }else{
                System.out.println("Fail - password is incorrect");
            }
        }
    }
}
