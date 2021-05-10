package saim_practice_task_all_day_coding;

/*
Create a class named Computer
create a main method

    - Create variables with most appropriate datatypes:

        - brand, processor, ram memory, storage memory, has monitor, has wifi card, description, price, cpu, color, number of monitors, number of usb slots, has usb 3.0

        - Print out all the variables and values of the computer
 */

public class Computer {
    public static void main(String[] args) {
        String brand = "HP Pavilion 27 All-in-On";
        String processor = "AMD Ryzen 7 octa core";
        String ramMemory = "16 GB RAM";
        String storageMemory = "256 GB SSD + 1 TB HDD";
        boolean hasMonitor = true;
        boolean hasWifi = true;
        String description = "27\" diagonal FHD display, weight is 19.6 lbs and has touchscreen";
        double price = 1_199.99;
        String cpu = "2.4 GHZ";
        String color = "grey";
        byte numberOfMonitors = 2;
        byte numOfUSBSlots = 7;
        boolean hasUsb3_0 = true;

        System.out.println("brand = " + brand);
        System.out.println("processor = " + processor);
        System.out.println("ram memory = " + ramMemory);
        System.out.println("storage memory = " + storageMemory);
        System.out.println("Has Monitor? = " + hasMonitor);
        System.out.println("Has wifi? = " + hasWifi);
        System.out.println("Description = " + description);
        System.out.println("price = $" + price);
        System.out.println("CPU = " + cpu);
        System.out.println("color = " + color);
        System.out.println("number of monitors = " + numberOfMonitors);
        System.out.println("num of USB slots = " + numOfUSBSlots);
        System.out.println("Has Usb 3.0? = " + hasUsb3_0);

    }
}
