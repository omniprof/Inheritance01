package com.cejv416.inheritance01;

public class Clerk extends Employee {

    private double salary;
    private String education;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public double getSalary() {
        return salary;
    }

    public String getEducation() {
        return education;
    }

    @Override
    public String toString() {
        String clerkReport = super.toString();
        clerkReport += ("Clerk\nSalary: " + salary
                + "\nEducation: " + education + "\n");
        return clerkReport;
    }

}
