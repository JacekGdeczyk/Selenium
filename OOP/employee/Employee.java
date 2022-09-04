package OOP.employee;

public class Employee {

String employeeName = "ABC";
int employeeId = 0;
int employeeSalary = 1000;

public void empBonusDisplay(){
    System.out.println("Employee " + employeeName + " gets the bonus of " + (employeeSalary * 0.20));
}
}
