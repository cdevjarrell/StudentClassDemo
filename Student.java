/*
 * Student.java
 * Author: Christian Jarrell
 * Course: CS3700
 * Description: Defines a Student class that stores personal details and up to six registered courses.
 */

public class Student {

    // Fields
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String stage;
    private Sring[] courses; // up to 6 registered courses

    // Constructor that accepts all properties as parameters for object initialization
    public Student(String name, int age, String email, String phoneNumber, String stage, String[] courses) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.stage = stage;
        this.courses = courses;
    }
}