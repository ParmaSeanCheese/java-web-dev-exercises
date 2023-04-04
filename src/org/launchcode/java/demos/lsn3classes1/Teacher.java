package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    protected String getFirstName(){
        return firstName;
    }
    protected void setFirstName(String aFirstName){
        firstName = aFirstName;
    }

    protected String getLastName(){
        return lastName;
    }
    protected void setLastName(String aLastName){
        lastName = aLastName;
    }

    protected String getSubject(){
        return subject;
    }
    protected void setSubject(String aSubject){
        subject = aSubject;
    }

    protected int getYearsTeaching(){
        return yearsTeaching;
    }
    protected void setYearsTeaching(int aYearsTeaching){
        yearsTeaching = aYearsTeaching;
    }
}
