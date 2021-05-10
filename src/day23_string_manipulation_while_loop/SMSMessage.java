package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] From Number<+1222-333-4444>" +
                "Message:{Hello, lets code some java}";

        //we can dothis long way
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start, end));//output: [Nadir
        //we want to print only Nadir without [
        System.out.println(message.substring(start+1, end));//Nadir
        String sender = message.substring(start+1, end);
        System.out.println("sender = " + sender);
        //OR WE CAN DO THIS SHORT WAY
        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println(" Tulay ".trim());//trim is cut space left and right side.it is not remove middle space
        //also trim can remove \t from left and right side
        System.out.println(" Tul ay ");

        if (sender.equals("Saim")) {
            System.out.println("Message from Saim about homework");
        } else {
            System.out.println("Someone else message");
        }



    }
}
