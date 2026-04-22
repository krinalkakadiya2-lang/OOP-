class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

public class Pr15 {
    public static void main(String[] args) {
        Employee emp = new Employee("Krinal", "HR");
        Manager mgr = new Manager("Raj", "IT", 10, "AI System");

        emp.displayDetails();
        System.out.println();
        mgr.displayDetails();
    }
}

/*
OUTPUT:

Employee Name: Krinal
Department: HR

Manager Name: Raj
Department: IT
Team Size: 10
Project: AI System
*/
