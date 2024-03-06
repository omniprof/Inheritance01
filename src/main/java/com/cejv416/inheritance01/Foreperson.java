package com.cejv416.inheritance01;

public class Foreperson extends AssemblyWorker {

    private String department1;
    private String department2;

    public void setDepartment1(String department1) {
        this.department1 = department1;
    }

    public void setDepartment2(String department2) {
        this.department2 = department2;
    }

    public String getDepartment1() {
        return department1;
    }

    public String getDepartmemt2() {
        return department2;
    }

    @Override
    public String toString() {
        String forepersonReport = super.toString();
        forepersonReport += ("Foreperson\nDepartment 1: " + department1
                + "\nDepartment 2: " + department2 + "\n");
        return forepersonReport;
    }

}
