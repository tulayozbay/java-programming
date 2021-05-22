package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();//suggestion variable name it gives from computer if you want--> how? only press ctrl+space that's all.
        System.out.println(animal.type);//it prints "some animal" it comes from Animal class
        animal.eat();//Animal is eating-->it comes from Animal class
        //Animal.eat(); --> it will not work because the eat method is not static method. we will do variable name to declare as a above.
        // Here we declared only with class name.
        animal.eat("grass");//it will work after we made new method as a String food in animal class
        animal.speak();//--> it works because it is variable name to callm method and methos non static
        //if we have static method Animal.speak() work. because Animal is class name work with static method

        //createnew Animal object cheetahObj
        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah"; //change value/reassign to "cheetah"
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
    }
}
