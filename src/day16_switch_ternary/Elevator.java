package day16_switch_ternary;

/**
add new package day16_switch_ternary
add new class Elevator

declare variable floorNum = 1
Multi branch if:
when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"

when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"

when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

anything else: print "Invalid floor - 6"
You do not have permission to send messages in this channel.

 */

public class Elevator {
    public static void main(String[] args) {

        int floorNum = 1;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }

        System.out.println("========== SWITCH STATEMENT VERSION ==========");

        floorNum = 1;
        switch (floorNum) {
            case 1:           //SAME AS  if (floorNum == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break; //MEANING IS EXIT THE SWITCH STATEMENT
            case 2:           // else if (floorNum == 2) {
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:// we put instead of "else" statement
                System.out.println("Invalid floor - " + floorNum);
                break; // if you want you can put here or not


        }

    }
}
