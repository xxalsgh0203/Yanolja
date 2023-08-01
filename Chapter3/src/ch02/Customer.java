package ch02;

public class Customer {
    protected int customerID; // 하위 클래스에서 접근할 수 있게끔
    protected String customerName; // 하위 클래스에서 접근할 수 있게끔
    protected String customerGrade;// 하위 클래스에서 접근할 수 있게끔
    int bonusPoint; // default 접근자 -> 해당 패키지 내에서만 접근 가능
    double bonusRatio;

    public Customer(){
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;

        System.out.println("Customer call()");
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다";
    }
}
