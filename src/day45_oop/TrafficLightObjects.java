package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {

        //create traffic light object]
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red";NOT THIS WAY NOT RECOMMEND
        //we will assign/update the value of color using method of the class
        trafficLight.changeColor("red");
        //System.out.println(trafficLight.color);//DIRECt access to variable.Not recommend
        //call method to access the variable:
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();


    }

}
