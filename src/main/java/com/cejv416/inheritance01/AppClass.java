package com.cejv416.inheritance01;

/**
 * Example of using inheritence and polymorphism
 *
 * @author Ken Fogel
 */
public class AppClass {

    private AssemblyWorker aw;
    private Foreperson fp;
    private Clerk ck;
    private Salesperson sp;
    private Manager mg;

    /**
     * Create different employees
     */
    private void makeEmployees() {
        System.out.println("\nAssemply Worker:");
        aw = new AssemblyWorker();
        aw.setName("Bob");
        aw.setAddress("123 Sesame Street");
        aw.setSSN(111222333);
        aw.setStartDate("January 1, 2000");
        aw.setSkill("Cheese Wrapper");
        aw.setDepartment("Paint");
        aw.setHourlyRate(11.50);
        aw.setHoursWorked(40);

        System.out.println("\nForeperson:");
        fp = new Foreperson();
        fp.setName("Paul");
        fp.setAddress("123 Ernie Way");
        fp.setSSN(678555343);
        fp.setStartDate("May 1, 2008");
        fp.setDepartment("Body Work");
        fp.setSkill("Cheese Polisher");
        fp.setHourlyRate(11.50);
        fp.setHoursWorked(40);
        fp.setDepartment1("Finishing");
        fp.setDepartment2("Sanding");

        System.out.println("\nClerk:");
        ck = new Clerk();
        ck.setName("Francis");
        ck.setAddress("123 Bert Road");
        ck.setSSN(414414333);
        ck.setStartDate("April 1, 2005");
        ck.setDepartment("Marketing");
        ck.setSalary(35000);
        ck.setEducation("BA");

        System.out.println("\nSalesperson:");
        sp = new Salesperson();
        sp.setName("Benjamin");
        sp.setAddress("123 Grouch Street");
        sp.setSSN(123123444);
        sp.setStartDate("March 1, 1994");
        sp.setDepartment("Engines");
        sp.setSalary(50000);
        sp.setCommission(0.2);
        sp.setProduct("widgets");
        sp.setTarget(2000000);

        System.out.println("\nManager:");
        mg = new Manager();
        mg.setName("Susan");
        mg.setAddress("123 Grover Strret");
        mg.setSSN(222444666);
        mg.setStartDate("February 1, 1990");
        mg.setDepartment("Fish");
        mg.setSalary(200000);
        mg.setBonus(50000);
    }

    /**
     * Display method coupled to the Foreperson object
     *
     * @param emp
     */
    private void displayForepersonEmployee(Foreperson emp) {

        System.out.println(emp.toString());

//        System.out.println(emp.getName());
//        System.out.println(emp.getAddress());
//        System.out.println(emp.getSSN());
//        System.out.println(emp.getDepartment());
//        System.out.println(emp.getStartDate());
//        System.out.println(emp.getDepartment1());
//        System.out.println(emp.getDepartmemt2());
//        System.out.println("\n");
    }

    /**
     * Using polymorphism this method can display any subclass of Employee
     *
     * @param emp
     */
    private void displayEmployee(Employee emp) {
        System.out.println(emp.toString());
    }

    /**
     * Create employees and display them
     */
    public void perform() {
        makeEmployees();
        // Without polymorphism
        //displayForepersonEmployee(fp);

        // With polymorphism
        //displayEmployee(aw);
        displayEmployee(fp);
        //displayEmployee(ck);
        //displayEmployee(sp);
        //displayEmployee(mg);
    }

    /**
     * This is where it all begins
     *
     * @param args
     */
    public static void main(String... args) {
        new AppClass().perform();
    }
}
