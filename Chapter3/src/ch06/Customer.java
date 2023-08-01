package ch06;

public class Customer {
    protected int customerID; // 하위 클래스에서 접근할 수 있게끔
    protected String customerName; // 하위 클래스에서 접근할 수 있게끔
    protected String customerGrade;// 하위 클래스에서 접근할 수 있게끔
    int bonusPoint; // default 접근자 -> 해당 패키지 내에서만 접근 가능
    double bonusRatio;

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer call()");
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다 ";
    }

    public int calcPrice(int price){    // 보너스 포인트만 적립함
        bonusPoint += price * bonusRatio;
        return price;
    }
}
