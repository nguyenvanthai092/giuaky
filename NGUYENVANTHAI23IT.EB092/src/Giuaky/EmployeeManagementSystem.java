package Giuaky;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        String ID = scanner.nextLine();
        System.out.println("Enter Full Name: ");
        String FullName = scanner.nextLine();
        System.out.println("Enter BirthDay: ");
        String BirthDay = scanner.nextLine();
        System.out.println("Enter Phone: ");
        String Phone = scanner.nextLine();
        System.out.println("Enter Email: ");
        String Email = scanner.nextLine();
        System.out.println("Enter Employee Type (Experience/Fresher/Intern): ");
        String Employee_type = scanner.nextLine();

        switch (Employee_type) {
            case "Experience":
                System.out.println("Enter Experience in Years: ");
                int ExpInYear = scanner.nextInt();
                scanner.nextLine(); // consume the remaining newline
                System.out.println("Enter Professional Skills: ");
                String ProSkill = scanner.nextLine();
                employees.add(new Experience(ID, FullName, BirthDay, Phone, Email, Employee_type, ExpInYear, ProSkill));
                break;
            case "Fresher":
                System.out.println("Enter Graduation Date: ");
                String Graduation_date = scanner.nextLine();
                System.out.println("Enter Graduation Rank: ");
                String Graduation_rank = scanner.nextLine();
                System.out.println("Enter Education: ");
                String Education = scanner.nextLine();
                employees.add(new Fresher(ID, FullName, BirthDay, Phone, Email, Employee_type, Graduation_date, Graduation_rank, Education));
                break;
            case "Intern":
                System.out.println("Enter Majors: ");
                String Majors = scanner.nextLine();
                System.out.println("Enter Semester: ");
                int Semester = scanner.nextInt();
                scanner.nextLine(); // consume the remaining newline
                System.out.println("Enter University Name: ");
                String University_name = scanner.nextLine();
                employees.add(new Intern(ID, FullName, BirthDay, Phone, Email, Employee_type, Majors, Semester, University_name));
                break;
            default:
                System.out.println("Invalid Employee Type");
        }
    }

    public void readEmployee() {
        System.out.println("Enter ID of Employee to Read: ");
        Scanner scanner = new Scanner(System.in);
        String ID = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.ID.equals(ID)) {
                employee.showInfo();
                return;
            }
        }
        System.out.println("Employee with ID " + ID + " not found.");
    }

    public void updateEmployee() {
        System.out.println("Enter ID of Employee to Update: ");
        Scanner scanner = new Scanner(System.in);
        String ID = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.ID.equals(ID)) {
                employee.showInfo(); // Display existing info
                System.out.println("Enter new information:");
                System.out.println("Enter Full Name: ");
                employee.FullName = scanner.nextLine();
                System.out.println("Enter BirthDay: ");
                employee.BirthDay = scanner.nextLine();
                System.out.println("Enter Phone: ");
                employee.Phone = scanner.nextLine();
                System.out.println("Enter Email: ");
                employee.Email = scanner.nextLine();
                return;
            }
        }
        System.out.println("Employee with ID " + ID + " not found.");
    }

    public void deleteEmployee() {
        System.out.println("Enter ID of Employee to Delete: ");
        Scanner scanner = new Scanner(System.in);
        String ID = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.ID.equals(ID)) {
                employees.remove(employee);
                System.out.println("Employee with ID " + ID + " has been deleted.");
                return;
            }
        }
        System.out.println("Employee with ID " + ID + " not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Create Employee");
            System.out.println("2. Read Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline after reading the choice

            switch (choice) {
                case 1:
                    system.createEmployee();
                    break;
                case 2:
                    system.readEmployee();
                    break;
                case 3:
                    system.updateEmployee();
                    break;
                case 4:
                    system.deleteEmployee();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
