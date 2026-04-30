import java.util.Scanner;

class Employee7 {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

public class pra7 {
    public static void main(String[] args) {
        Employee7 emp = new Employee7();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
