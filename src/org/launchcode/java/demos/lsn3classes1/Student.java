package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    protected String getName() {
        return name;
    }
    protected void setName(String aName) {
        name = aName;
    }

    protected int getStudentId() {
        return studentId;
    }
    protected void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    protected int getNumberOfCredits() {
        return numberOfCredits;
    }
    protected void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    protected double getGpa(){
        return gpa;
    }
    protected void setGpa(double aGpa) {
        gpa = aGpa;
    }
}