/*
 * DateOfBirth.java
 * Author: Christian Jarrell
 * Course: CS3700
 * Description: Represents a student's date of birth using day, month, and year.
 *              Used by the Student class through composition
 */

public class DateOfBirth {

    //Fields
    private int day;
    private int month;
    private int year;

    // Constructor to init date of birth
    public DateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returns the date of birth as a formatted string (MM/DD/YYYY)
    public String getFormattedDate() {
        return month + "/" + day + "/" + year;
    }
}
