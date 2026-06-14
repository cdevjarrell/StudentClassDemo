/*
 * Student.java
 * Author: Christian Jarrell
 * Course: CS3700
 * Description: Defines a Student class that stores personal details and up to six registered courses.
 */

public class Student {

    // Static counter used by all Student objects
    private static int studentCount = 0;

    // Fields
    private String name;
    private DateOfBirth dateOfBirth;
    private String email;
    private String phoneNumber;
    private String stage;
    private String[] courses; // up to 6 registered courses

    // Constructor that accepts all properties as parameters for object initialization
    public Student(String name, DateOfBirth dateOfBirth, String email, String phoneNumber, String stage, String[] courses) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.stage = stage;
        this.courses = courses;
        studentCount++; // Increments up each time a new student is created
    }

    // Prints all of the student's info, including registered courses
    public void printMe() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth.getFormattedDate());
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Stage: " + stage);
        System.out.println("Courses:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(" " + (i + 1) + ". " + courses[i]);
        }
        System.out.println("--------------------------------------");
    }
}