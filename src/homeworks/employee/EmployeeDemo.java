package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    System.out.println("Enter employee ID");
                    String id = scanner.nextLine();
                    employeeStorage.searchByID(id);
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    System.out.println("Enter employee company");
                    String company = scanner.nextLine();
                    employeeStorage.searchByCompany(company);
                    break;
            }
        }
    }

    public static void printCommands() {
        System.out.println("Please input 0 to Exit");
        System.out.println("Please input 1 to add Employee");
        System.out.println("Please input 2 to print all Employees");
        System.out.println("Please input 3 to search Employee by ID");
        System.out.println("Please input 4 to search Employee by company");
    }

    public static void addEmployee() {
        System.out.println("Enter employee name");
        String name = scanner.nextLine();
        System.out.println("Enter employee surname");
        String surname = scanner.nextLine();
        System.out.println("Enter employee ID");
        String id = scanner.nextLine();
        System.out.println("Enter employee salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter employee company");
        String company = scanner.nextLine();
        System.out.println("Enter employee position");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, id, salary, company, position);
        employeeStorage.add(employee);
    }


}
