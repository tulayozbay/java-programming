package day14_multi_branch_if_stateents;

/*
add new package day14_multi_branch_if_statements
add new class YesOrNo
add main method

print "Are you sure you want to delete this file?"
selection > "y";
answer -> boolean variable

selection -- "y"
    true :
        "your file will be deleted"
        answer -> true
    false :
        "file deletion cancelled"
        answer -> false


"Did file get deleted? - true"
 */
public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure want to delete this file?");
        char selection = 'y'; //also we can use String selectin = "y";//if change the value everything is changing.
        boolean answer;//we are putting this because assing the answer as a buttom we did.
        String result; // we can also put this too. for below we need to assign.
        if (selection == 'y') {
            System.out.println("Your file will be deleted.");
            answer = true;
            result = "deleted";
        } else {
            System.out.println("file deletion calceled.");
            answer = false;
            result = "nat deleted";
        }

        System.out.println("Did file get deleted? - " + answer);
        System.out.println("Did file get deleted? - " + result);

    }


}
