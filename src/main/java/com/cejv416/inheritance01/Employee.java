package com.cejv416.inheritance01;

public class Employee {

    private String name;
    private String address;
    private long ssn;
    private String startDate;
    private String department;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSSN(long ssn) {
        this.ssn = ssn;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getSSN() {
        return ssn;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        String report = "Employee\nName: " + name
                + "\nAddress: " + address
                + "\nSocial Insurance Number: " + ssn
                + "\nStarting Date: " + startDate
                + "\nDepartment: " + department + "\n";
        return report;
    }
}
