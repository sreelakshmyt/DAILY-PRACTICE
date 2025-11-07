package Inheritance.TASK2;

import java.util.ArrayList;
import java.util.List;


abstract class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public abstract void displayRole();
}

class Instructor extends User {
    private List<String> courseMaterials;

    public Instructor(String userId, String name) {
        super(userId, name);
        this.courseMaterials = new ArrayList<>();
    }

  
    @Override
    public void displayRole() {
        System.out.println(name + " is an Instructor.");
    }


    public void uploadMaterial(String material) {
        courseMaterials.add(material);
        System.out.println("Material uploaded: " + material);
    }

    public void displayMaterials() {
        System.out.println("Course Materials for Instructor " + name + ":");
        for (String material : courseMaterials) {
            System.out.println("- " + material);
        }
    }
}

class Student extends User {
    private List<Course> enrolledCourses;

    public Student(String userId, String name) {
        super(userId, name);
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Student.");
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " has enrolled in the course: " + course.getCourseName());
    }

    public void viewEnrolledCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}


class Course {
    private String courseName;
    private Instructor instructor;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

 
    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

   
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
        System.out.println("Instructor " + instructor.name + " assigned to the course: " + courseName);
    }

   
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

   
    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.name);
        }
    }
}

public class CourseMain {
    public static void main(String[] args) {
        
        Instructor instructor = new Instructor("I001", "Dr. Smith");
        Student student1 = new Student("S001", "John");
        Student student2 = new Student("S002", "Alice");

        
        instructor.displayRole();
        student1.displayRole();
        student2.displayRole();

      
        Course course = new Course("Java Programming");

       
        course.setInstructor(instructor);

       
        instructor.uploadMaterial("Introduction to Java");
        instructor.uploadMaterial("OOP Concepts in Java");
        instructor.displayMaterials();

       
        student1.enrollInCourse(course);
        student2.enrollInCourse(course);

        
        course.displayEnrolledStudents();

        
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();
    }
}
