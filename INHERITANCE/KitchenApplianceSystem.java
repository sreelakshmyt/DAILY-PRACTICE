package Inheritance.TASK3;

class Appliance {
    int applianceId;
    String name;
    String brand;

    public Appliance(int applianceId, String name, String brand) {
        this.applianceId = applianceId;
        this.name = name;
        this.brand = brand;
        System.out.println("Appliance Constructor Called");
    }

    public void displayApplianceDetails() {
        System.out.println("Appliance ID: " + applianceId);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
    }
}

class CookingAppliance extends Appliance {
    int powerUsage;

    public CookingAppliance(int applianceId, String name, String brand, int powerUsage) {
        super(applianceId, name, brand);
        this.powerUsage = powerUsage;
        System.out.println("CookingAppliance Constructor Called");
    }

    public void displayCookingApplianceDetails() {
        displayApplianceDetails();
        System.out.println("Power Usage: " + powerUsage + " watts");
    }
}

class Oven extends CookingAppliance {
    double capacity;

    public Oven(int applianceId, String name, String brand, int powerUsage, double capacity) {
        super(applianceId, name, brand, powerUsage);
        this.capacity = capacity;
        System.out.println("Oven Constructor Called");
    }

    public void displayOvenDetails() {
        displayCookingApplianceDetails();
        System.out.println("Oven Capacity: " + capacity + " liters");
    }
}

class Microwave extends CookingAppliance {
    int timer;

    public Microwave(int applianceId, String name, String brand, int powerUsage, int timer) {
        super(applianceId, name, brand, powerUsage);
        this.timer = timer;
        System.out.println("Microwave Constructor Called");
    }

    public void displayMicrowaveDetails() {
        displayCookingApplianceDetails();
        System.out.println("Microwave Timer: " + timer + " minutes");
    }
}

public class KitchenApplianceSystem {
    public static void main(String[] args) {
        System.out.println("Creating Oven and Microwave objects:\n");

        Oven oven = new Oven(101, "Samsung Oven", "Samsung", 1500, 30);
        Microwave microwave = new Microwave(102, "LG Microwave", "LG", 1200, 10);

        System.out.println("\nOven Details:");
        oven.displayOvenDetails();
        System.out.println("-----------------------------");

        System.out.println("\nMicrowave Details:");
        microwave.displayMicrowaveDetails();
    }
}


