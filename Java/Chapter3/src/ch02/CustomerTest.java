package ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer Lee = new Customer(10010, "이순신");
        Lee.bonusPoint = 1000;
        System.out.println(Lee.showCustomerInfo());

        VIPCustomer Kim = new VIPCustomer(10020, "김유신");
        Kim.bonusPoint = 10000;
        System.out.println(Kim.showCustomerInfo());

        Customer Koo = new VIPCustomer(10030, "홍길동"); // Customer 클래스 멤버 변수 메서드만 사용가능
        Koo.bonusPoint = 5000;
        System.out.println(Koo.showCustomerInfo());
    }
}
