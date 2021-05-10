package saim_practice_task_all_day_coding;

/*
Create a class Employee
create a main method

    Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)

        - first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,

    Declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
        - Salary after 3 years (base salary + start month * 10000)
            Ex: base: 100000
                start day: 2
                after 3 year: (100000 + (2 * 1000)) = 102000



 */

public class Employee {
    public static void main(String[] args) {
        String firstName = "Tulay";
        String lastName = "Adiguzel";
        String company = "Tesla";
        double salary = 128254;
        int startDay = 4;
        String startMonth = "October";
        int startYear = 2021;
        boolean isFullTime = true;
        String jobTitle = "SDET";
        String officeAddress = "100 S LaneHampton, VA 13312";

        String fullName = firstName + " " + lastName;
        String fullStartDate = startMonth + " " + startDay + ", " + startYear;
        String email = firstName + startDay + "@" + company + ".com";
        double salaryAfter3Years = salary + (startDay * 1000);

        System.out.println("***** Tesla New Hire Information *****");
        System.out.println(firstName + " welcome to " + company);
        System.out.println("Your start date as a " + jobTitle + " will be on " + fullStartDate);
        System.out.println("You are fulltime: " + isFullTime + " and will be making $" + salary + " per year");
        System.out.println("The office located at: \n" + officeAddress);
        System.out.println();
        System.out.println("\tOfficial information:");
        System.out.println("New hire name: " + fullName);
        System.out.println("Starts on: " + fullStartDate);
        System.out.println("Email generated: " + email);
        System.out.println("Your expected salary after 3 years: " + salaryAfter3Years);


    }
}
