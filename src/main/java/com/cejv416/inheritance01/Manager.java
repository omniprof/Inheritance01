package com.cejv416.inheritance01;

public class Manager extends Employee {

    private double salary;
    private double bonus;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        String managerReport = super.toString();
        managerReport += ("Manager\nSalary: " + salary
                + "\nBonus:" + bonus + "\n");
        return managerReport;
    }

}
