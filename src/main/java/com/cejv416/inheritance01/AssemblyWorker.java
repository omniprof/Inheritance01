package com.cejv416.inheritance01;

public class AssemblyWorker extends Employee {

    private double hourlyRate;
    private double hoursWorked;
    private String skill;

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        String assemblyworkerReport = super.toString();
        assemblyworkerReport += ("Assembly Worker\nSkill: " + skill
                + "\nHours worked: " + hoursWorked
                + "\nHourly rate: " + hourlyRate + "\n");
        return assemblyworkerReport;
    }
}
