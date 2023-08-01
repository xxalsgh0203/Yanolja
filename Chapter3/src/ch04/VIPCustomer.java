package ch02;

public class VIPCustomer extends Customer {
    double salesRatio;
    String agentID;

    public VIPCustomer(int customerID, String customerName){

        super(customerID, customerName); // 하위 클래스가 상위 클래스 인스턴스의 참조값을 가짐, 생성자를 호출할 수 있음, 생략가능 -> 컴파일러가 호출해줌

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIP Customer call()");
    }

    public double getSalesRatio() {
        return salesRatio;
    }

    public void setSalesRatio(double salesRatio) {
        this.salesRatio = salesRatio;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
