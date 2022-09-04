package OOP.employee;

public class Employee_Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.employeeName = "Jack";
        e1.employeeId = 1;
        e1.employeeSalary = 100;

        e1.empBonusDisplay();

        e2.employeeName = "Herman";
        e2.employeeId = 2;
        e2.employeeSalary = 200;

        e2.empBonusDisplay();

        /*Employee c2 = new Employee();
        c2.color = "Orange";
        c2.make = "Toyota";
        c2.type = "Sedan";

        c2.displayDetails();*/
    }
}
