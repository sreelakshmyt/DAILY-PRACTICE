package Inheritance.TASK1;

class Artifact {
 protected int artifactId;
 protected String name;
 protected String origin;
 protected int yearOfCreation;

 public Artifact(int artifactId, String name, String origin, int yearOfCreation) {
     this.artifactId = artifactId;
     this.name = name;
     this.origin = origin;
     this.yearOfCreation = yearOfCreation;
 }

 
 public void displayDetails() {
     System.out.println("Artifact ID: " + artifactId);
     System.out.println("Name: " + name);
     System.out.println("Origin: " + origin);
     System.out.println("Year of Creation: " + yearOfCreation);
 }
}


class Painting extends Artifact {
 private String artist;
 private String style;

 public Painting(int artifactId, String name, String origin, int yearOfCreation, String artist, String style) {
     super(artifactId, name, origin, yearOfCreation);
     this.artist = artist;
     this.style = style;
 }

 
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Artist: " + artist);
     System.out.println("Style: " + style);
 }
}


class Sculpture extends Artifact {
 private String material;
 private double height;

 public Sculpture(int artifactId, String name, String origin, int yearOfCreation, String material, double height) {
     super(artifactId, name, origin, yearOfCreation);
     this.material = material;
     this.height = height;
 }

 
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Material: " + material);
     System.out.println("Height: " + height + " meters");
 }
}


class AncientText extends Artifact {
 private String language;
 private int numPages;

 public AncientText(int artifactId, String name, String origin, int yearOfCreation, String language, int numPages) {
     super(artifactId, name, origin, yearOfCreation);
     this.language = language;
     this.numPages = numPages;
 }

 
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Language: " + language);
     System.out.println("Number of Pages: " + numPages);
 }
}


public class MuseumSystem {
 public static void main(String[] args) {
    
     Painting painting = new Painting(101, "Mona Lisa", "Italy", 1503, "Leonardo da Vinci", "Renaissance");
     Sculpture sculpture = new Sculpture(102, "David", "Italy", 1504, "Marble", 5.17);
     AncientText ancientText = new AncientText(103, "The Epic of Gilgamesh", "Mesopotamia", -2100, "Sumerian", 12);

     System.out.println("Painting Details:");
     painting.displayDetails();
     System.out.println("");

     System.out.println("Sculpture Details:");
     sculpture.displayDetails();
     System.out.println("");

     System.out.println("Ancient Text Details:");
     ancientText.displayDetails();
 }
}
