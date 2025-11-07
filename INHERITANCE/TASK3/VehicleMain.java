package Inheritance.TASK3;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    protected String model;
    protected double fuelEfficiency; // km per liter
    protected double maxSpeed;

    public Vehicle(String model, double fuelEfficiency, double maxSpeed) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    public abstract void displayDetails();
}

class ElectricVehicle extends Vehicle {
    private double batteryLife; // in hours

    public ElectricVehicle(String model, double fuelEfficiency, double maxSpeed, double batteryLife) {
        super(model, fuelEfficiency, maxSpeed);
        this.batteryLife = batteryLife;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electric Vehicle Model: " + model);
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}

class DieselVehicle extends Vehicle {
    private double fuelTankCapacity; // in liters

    public DieselVehicle(String model, double fuelEfficiency, double maxSpeed, double fuelTankCapacity) {
        super(model, fuelEfficiency, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Diesel Vehicle Model: " + model);
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

class HybridVehicle extends Vehicle {
    private double batteryLife;
    private double fuelTankCapacity;

    public HybridVehicle(String model, double fuelEfficiency, double maxSpeed, double batteryLife, double fuelTankCapacity) {
        super(model, fuelEfficiency, maxSpeed);
        this.batteryLife = batteryLife;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Hybrid Vehicle Model: " + model);
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

class Fleet {
    private List<Vehicle> vehicles;

    public Fleet() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public double calculateTotalFuelEfficiency() {
        double totalEfficiency = 0;
        for (Vehicle vehicle : vehicles) {
            totalEfficiency += vehicle.fuelEfficiency;
        }
        return totalEfficiency;
    }

    public void displayFleetDetails() {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println();
        }
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        ElectricVehicle ev1 = new ElectricVehicle("Tesla Model S", 0, 250, 12);
        DieselVehicle dv1 = new DieselVehicle("Ford F-150", 15, 180, 80);
        HybridVehicle hv1 = new HybridVehicle("Toyota Prius", 20, 170, 10, 45);

        Fleet fleet = new Fleet();
        fleet.addVehicle(ev1);
        fleet.addVehicle(dv1);
        fleet.addVehicle(hv1);

        fleet.displayFleetDetails();
        System.out.println("Total Fuel Efficiency of the Fleet: " + fleet.calculateTotalFuelEfficiency() + " km/l");
    }
}

