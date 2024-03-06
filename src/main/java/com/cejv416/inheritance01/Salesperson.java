package com.cejv416.inheritance01;

public class Salesperson extends Employee {

    private double salary;
    private double commission;
    private String product;
    private double target;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public double getSalary() {
        return salary;
    }

    public double getCommission() {
        return commission;
    }

    public String getProduct() {
        return product;
    }

    public double getTarget() {
        return target;
    }

    @Override
    public String toString() {
        String salespersonReport = super.toString();
        salespersonReport += ("Sales Person\nSalary: " + salary
                + "\nCommission: " + commission
                + "\nProduct=" + product + "\nTarget="
                + target + "\n");
        return salespersonReport;
    }

}
