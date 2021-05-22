package day46_encapsulation;

public class Car {
    private String model ;
    private int year ;
    private int mileage ;//==this.mileage;

    //setter method for model
    public void setModel(String carModel){//carModel yerine model kullanmayiz.
        model = carModel;
    }

    //getter method for model
    public String getModel(){
        return model;
    }

    //setter for year
    public void setYear(int year){//if you use same name (year) you need to assign as a below
        this.year = year;
        //Important--> using same name always the best practice.
        //because of (this.)

    }

    //getter for year
    public int getYear(){
        return year;
    }

    //setter for mileage]
    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    //getter for mileage
    public int getMileage(){
        return mileage;//you can say return this.mileage; too
    }

    //generate toString --> right click + generate + toString + and chose which one you want go toString

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }


    //OR you can write yoursel
//    public String toString(){
//        return "Car => model = " + model;
//    }



}
