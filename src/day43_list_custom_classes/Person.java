package day43_list_custom_classes;
//WE CAN WRITE MANY CLASS HERE BUT ONLY ONE CAN BE PUCLIC
public class Person {
    //the purpose of creating the custom method
    //1) reuse
    //2)
    String firstName;
    int age;
}

class People{//This is cannot be public it gives error EHEN YOU WRITE THE PUBLIC
    public static void main(String[] args) {
       //create object of Person class - Instantiate Person class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;

        System.out.println(person1.firstName);
        System.out.println(person1.age);

    }
}
