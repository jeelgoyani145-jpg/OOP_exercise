class Employee15 {
    String name;
    String department;

    Employee15(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee15 {
    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

public class pra15 {
    public static void main(String[] args) {
        Employee15 emp = new Employee15("John", "IT");
        System.out.println("--- Employee ---");
        emp.displayDetails();

        Manager mgr = new Manager("Sara", "IT", 8, "ERP System");
        System.out.println("--- Manager ---");
        mgr.displayDetails();

        System.out.println("--- Runtime Polymorphism ---");
        Employee15 poly = new Manager("Tom", "Finance", 5, "Billing");
        poly.displayDetails();
    }
}
