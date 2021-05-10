package day13_conitional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

       // if (isHungry == true) {
       //
       // }

        if(isHungry == true) { //eger bir tane = konulsaydi sonuc tamamen farkli olacakti.cunku o zaman assign anlamina gelirdi.
            System.out.println("I am hungry, I will go get something to eat!");
            System.out.println("Then code java!");
        } else {
            System.out.println("I am not hungry, I will keep coding java!");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200; //200 is budget

        System.out.println("isAffordable = " + isAffordable);

        if(isAffordable) {
            System.out.println("I can afford it, lets buy!");
        } else {
            System.out.println("Too expensive, lets keep coding java");
        }

        boolean isRemoteJob = true;
        //if it is NOT remoteJob print "Sorry I am not interested"
        //otherwisw, print "Sure I am interested, what is the interview process?"
       // if(isAffordable != true)
        //if(isAffordable == false)

        if(isAffordable != true){
            System.out.println("Sorry I am not interested");
        } else {
            System.out.println("Sure I am interested, what is the interview process?");
        }

       }
    }