package day44_custom_classes;

public class Animal {

        String type = "some animal";//type is attribute

        public void eat(){
            System.out.println("Animal is eating");
        }
        public void speak(){
            System.out.println("Animal is speaking");
        }
        public void eat (String food){
            System.out.println("eating " + food);
        }

}
