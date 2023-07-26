package ch16;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println(Employee.getSerialNum()); // serialNum 은 static 변수이기 때문에 인스턴스 생성하지 않아도 됨

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        // System.out.println(employeeLee.serialNum);
        System.out.println(employeeKim); // same as employeeKim.toString();
        System.out.println(employeeLee);
    }
}
