package day43_list_custom_classes;
//WE CAN WRITE MANY CLASS HERE BUT ONLY ONE CAN BE PUCLIC
public class Person {
    //the purpose of creating the custom method
    //1) reuse
    //2)to create an object
    //those one will be template because those one CLASS(recipe)
    //Data Variables
    //we cant use in object anything we do not declare the variable here .
    //We have here firstName and age we can use both in object but we cannot use email variable name because we are not declare yet
    //Data Variables
    String firstName;
    int age;
    char gender;

    //behaviour it is going to be methods
    public void speak(){//this is behaviour of the class-->This is NON-STATIC method
        System.out.println("Person id speaking");
    }


}

class People{//--> Class will run with main method //This is cannot be public it gives error WHEN YOU WRITE THE PUBLIC
    public static void main(String[] args) {
       //create object of Person class - Instantiate Person class--> instantiate==orneklemek
        //we should create our object way we use for this "new"  Person person1 = new Person();
        //Those one will be OBJECT(cook)
        Person person1 = new Person();//person is my object
        //we use the template as a up we create
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        //YOU CAN CREATE MANY MORE OBJECT TOO

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 12;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

        System.out.println("person1.firstName = " + person1.firstName);//bob--> because still person1 s same not changing any


    }
}
