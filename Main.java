/*
 * Main.java
 * Author: Christian Jarrell
 * Course: CS3700
 * Description: Driver class that creates Student objects with different numbers of registered courses and prints
 * their information
 */

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // First student - 6 courses (full load)
        String[] courses1 = {"CS3700", "MATH2400", "ENG1010", "HIST1500", "PHYS2100", "ART1000"};
        DateOfBirth dob1 = new DateOfBirth(5, 14, 2004);
        Student student1 = new Student("Alice Jones", dob1, "alice.j@school.edu", "828-555-0101", "Sophomore", courses1);

        // Second student - 4 courses
        String[] courses2 = {"CS3700", "BIO1200", "CHEM1100", "PSY1010"};
        DateOfBirth dob2 = new DateOfBirth(11, 2, 2002);
        Student student2 = new Student("Brian Davidson", dob2, "brian.davidson@school.edu", "828-555-0102", "Senior", courses2);

        // Third student - 2 courses (part-time)
        String[] courses3 = {"CS3700", "MUS1000"};
        DateOfBirth dob3 = new DateOfBirth(8, 23, 2004);
        Student student3 = new Student("Carmen Diaz", dob3, "carmen.d@school.edu", "828-555-0103", "Freshman", courses3);

        // Print each student's information
        student1.printMe();
        student2.printMe();
        student3.printMe();
    }
}