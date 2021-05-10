package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();//1st call the method
        displayMessage();//2nd call the method
        displayMessage();//3rd call the method

        for (int i = 1; i <= 100; i++){//if you want to print many many time use loop
            System.out.print(i + " - ");
            displayMessage();
        }

    }

    //first custom reusable method
    public static void displayMessage(){
        System.out.println("Hello B22 Friends!");//3 times will print because we call the method 3 times

    }

}
