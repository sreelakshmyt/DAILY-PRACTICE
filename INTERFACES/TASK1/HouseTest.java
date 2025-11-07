package INTERFACE.TASK1;

interface LivingSpace {
    void openDoor();
    void lockDoor();
}

interface HeatingSystem {
    void turnOnHeating();
    void turnOffHeating();
}

class House implements LivingSpace, HeatingSystem {
    public void openDoor() {
        System.out.println("Opening the door of the house.");
    }

    public void lockDoor() {
        System.out.println("Locking the door of the house.");
    }

    public void turnOnHeating() {
        System.out.println("Turning on the heating system.");
    }

    public void turnOffHeating() {
        System.out.println("Turning off the heating system.");
    }
}

public class HouseTest {
    public static void main(String[] args) {
        House house = new House();
        house.openDoor();
        house.turnOnHeating();
        house.lockDoor();
    }
}
