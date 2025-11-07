package Inheritance.TASK2;

class player {
    int playerId;
    String name;
    int age;
    String teamName;

    public player(int playerId, String name, int age, String teamName) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.teamName = teamName;
    }

    public void displayPlayerDetails() {
        System.out.println("Player ID: " + playerId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Team Name: " + teamName);
    }
}

class Cricketer extends player {
    double battingAverage;
    double bowlingAverage;

    public Cricketer(int playerId, String name, int age, String teamName, double battingAverage, double bowlingAverage) {
        super(playerId, name, age, teamName);
        this.battingAverage = battingAverage;
        this.bowlingAverage = bowlingAverage;
    }

    public void displayCricketerDetails() {
        displayPlayerDetails();
        System.out.println("Batting Average: " + battingAverage);
        System.out.println("Bowling Average: " + bowlingAverage);
    }
}

class Batsman extends Cricketer {
    int numberOfCenturies;

    public Batsman(int playerId, String name, int age, String teamName, double battingAverage, double bowlingAverage, int numberOfCenturies) {
        super(playerId, name, age, teamName, battingAverage, bowlingAverage);
        this.numberOfCenturies = numberOfCenturies;
    }

    public void displayBatsmanDetails() {
        displayCricketerDetails();
        System.out.println("Number of Centuries: " + numberOfCenturies);
    }
}

public class SportsTeamManagement{
    public static void main(String[] args) {
        Batsman batsman = new Batsman(1, "Virat Kohli", 32, "India", 59.07, 53.5, 27);

        System.out.println("Batsman Details:");
        batsman.displayBatsmanDetails();
    }
}
