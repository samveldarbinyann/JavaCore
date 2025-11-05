package homeworks.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[20];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extand();
        }
        employees[size++] = employee;

    }

    private void extand() {
        Employee[] temp = new Employee[size + 20];
        System.arraycopy(employees, 0, temp, 0, size);
        employees = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void searchByID(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchByCompany(String company) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().toLowerCase().contains(company.toLowerCase())) {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchByPosition(String position) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getPosition().toString().equals(position)) {
                System.out.println(employees[i]);
            }
        }
    }
}
