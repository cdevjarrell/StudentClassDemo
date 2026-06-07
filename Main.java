/*
 * Main.java
 * Author: Christian Jarrell
 * Course: CS3700
 * Description: Driver class that creates Student objects with different numbers of registered courses and prints
 * their information
 */

public class Main {
    public static void main(String[] args) {

        // First student - 6 courses (full load)
        String[] courses1 = {"CS3700", "MATH2400", "ENG1010", "HIST1500", "PHYS2100", "ART1000"};
        Student student1 = new Student("Alice Jones", 20, "alice.j@school.edu", "828-555-0101", "Sophomore", courses1);

        student1.printMe();
    }
}