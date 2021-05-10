package OfficeHours.Practice_03_02_2021;


//    src -> new package called Office Hours
//    Practice_03_02_2021

/*
Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information



    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star
 */

public class PersonalInfo {
    public static void main(String[] args){

        //Varibles without any data

        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate; // (month.day)

        //Assignment of data

        name = "Tulay";
        age = 50;
        gender = 'F';
        student = true;
        numberOfSiblings = 3;
        favoriteNumber = 12L;
        numberOfSeasons = 4;
        birthDate = 3.2; // month and day
        year = 2021;
        fullBirthDate = + birthDate + "."+ year; //3.2.2021
//        fullBirthDate = birthDate + year + ""; //2024.2 -> adds first then turns to String
        favoriteQuote = "have a good mindset";

        System.out.println(birthDate + '.'); //sonuc olarak 3.2+46 yani 49.2 olarak verecektir
//        cunku single code icindeki noktayi ona ekledigimizde bilgisayar onu farkli algilar
//        yani single code icindeki nokanin degerine hemen ASCII den bakar ki o da 46 dir ve onu ekler.

        String printName = "Name: " + name;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Full Birtdate: " + fullBirthDate);


    }

}
