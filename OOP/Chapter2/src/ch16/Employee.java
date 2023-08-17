package ch16;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;

    private static int serialNum = 1000;
    // static 변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않다.
    // 프로그램이 메모리에 올라가면 프로세스가 되고 프로세스가 종료되야 사라짐.
    // 인스턴스들 끼리 정말 고유되어야 하는 데이터가 있을때 static 을 사용하면 됨.

    public Employee() {
        this.employeeId = serialNum;
        serialNum++;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public String toString(){
        return (this.employeeName + "님의 ID는 " + this.employeeId);
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
