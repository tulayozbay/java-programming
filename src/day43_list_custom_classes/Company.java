package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        /**
         * add new class Company
         * add 3 objects of Employee
         * assign name and job titles.
         * call method
         */
        //you can do this in the Employee class too.

        Employee employee1 = new Employee();
        employee1.name = "Tulay Adiguzel";
        employee1.jobTitle = "SDET";
        employee1.work();//when you run after this it gives you this //Tulay Adiguzel works as SDET
        //because we already prin in the employee section in the method
        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);

        Employee employee2 = new Employee();
        employee2.name= "Adar Inan Adiguzel";
        employee2.jobTitle = "Full stack developer";
        employee2.work();
        System.out.println(employee2.name);
        System.out.println(employee2.jobTitle);

    }
}
