package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {

        //We will create new instance(object) for Car class. ---> with new keyboard
        Car car1 = new Car();
        //bu note Murodil'in
        //Error below, model an year are PRIVATE and cannot be access
        //car1.model = "Nissan Altima";
        //car1.year = 2014;
        //asagidaki not benim
        //car1.model ="NISSAN";//not accessible not visible model variable name. It cannot show other class. Why because it is private

        // The below thing after done setModel and getModel. We done encapsulate in Car class
        car1.setModel("Nissan Altima");
        System.out.println("car1 Model. = " + car1.getModel());

//        car1.year = 2017;-->ERROR --> it won't work because it is private
        car1.setYear(2017);
        System.out.println("car1 getYear() = " + car1.getYear());


        //once set... ile assign yapilir get... ile sout yapilir.
        car1.setMileage(78_526);
        System.out.println("car1 Mileage = " + car1.getMileage());

        System.out.println(car1.toString());//Car{model='Nissan Altima', year=2017, mileage=78526}
        System.out.println(car1);//Car{model='Nissan Altima', year=2017, mileage=78526}-->automatically calls toString METHOD

        //Both are gave same output-->check Murodil's note






    }
}
