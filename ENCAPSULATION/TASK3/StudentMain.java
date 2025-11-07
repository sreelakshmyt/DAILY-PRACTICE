package ENCAPSULATION.TASK3;

class InvalidGradeException extends Exception {
 public InvalidGradeException(String message) {
     super(message);
 }
}

class Student {
 private String name;
 private int rollNumber;
 private int[] grades;
 private double[] weights; 

 public Student(String name, int rollNumber, int[] grades, double[] weights) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.grades = grades;
     this.weights = weights;
 }

 
 public void setGrades(int[] grades) throws InvalidGradeException {
     for (int grade : grades) {
         if (grade < 0 || grade > 100) {
             throw new InvalidGradeException("Grade must be between 0 and 100.");
         }
     }
     this.grades = grades;
 }

 public double calculateGPA() {
     double totalWeightedGrades = 0;
     double totalWeight = 0;

     for (int i = 0; i < grades.length; i++) {
         totalWeightedGrades += grades[i] * weights[i];
         totalWeight += weights[i];
     }

     
     return totalWeightedGrades / totalWeight;
 }


 public void displayStudentDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("GPA: " + calculateGPA());
 }
}

public class StudentMain {
 public static void main(String[] args) {
    
     int[] grades = {85, 90, 78};   
     double[] weights = {0.4, 0.3, 0.3}; 

     try {
       
         Student student = new Student("John Doe", 101, grades, weights);

         student.setGrades(grades);  
         student.displayStudentDetails();
     } catch (InvalidGradeException e) {
         
         System.out.println("Error: " + e.getMessage());
     }
 }
}
