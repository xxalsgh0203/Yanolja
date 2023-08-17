package ch16;

// 싱글톤 패턴은 프로그램에서 인스턴스가 단 한개만 생성되어야 하는 경우 사용하는 디자인 패턴이다. ex)날짜
// static 변수와 메서드를 활용하여 구현할 수 있다.
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
