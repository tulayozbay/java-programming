package day45_oop;

public class Coffee {

    /**
     * can be 0 - 100 as a percentage
     */
    String type;
    int amount;

    public void refill(){
        amount = 100;
    }
    public void drink(int someAmount){

        amount -= someAmount;
    }

    @Override
    public String toString() {

        // BU ASAGIDAKINI KISA YOLDAN YAPMAK ICIN SAG TIKLA GENERATE TIKLA TO STRING E TIKLA VE OK A TIKLA BNU SANA VERECEK
        return "Coffee{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public int getAmount(){
        return amount;
    }
    public void setType(String newType){
        type = newType;
    }
    public String getType(){
        return type;
    }


}
