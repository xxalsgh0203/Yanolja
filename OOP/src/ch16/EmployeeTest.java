package ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(Employee.getSerialNum());

        // System.out.println(employeeLee.serialNum);
        System.out.println(employeeKim); // same as employeeKim.toString();
        System.out.println(employeeLee);
    }
}
