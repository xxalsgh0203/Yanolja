package ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer Lee = new Customer(10010, "이순신");
        Lee.bonusPoint = 1000;
        int price1 = Lee.calcPrice(1000); //1000
        System.out.println(Lee.showCustomerInfo() + price1);

        VIPCustomer Kim = new VIPCustomer(10020, "김유신");
        Kim.bonusPoint = 10000;
        int price2 = Kim.calcPrice(1000); //900
        System.out.println(Kim.showCustomerInfo() + price2);

        Customer Koo = new VIPCustomer(10030, "홍길동"); // Customer 클래스 멤버 변수 메서드만 사용가능
        Koo.bonusPoint = 5000;
        int price3 = Koo.calcPrice(1000); //900 -> Koo 는 Customer 로 형변환이 되었지만 인스턴스의 메소드가 호출됨
        // 더 자세히 설명하자면 Koo 의 변수 타입은 Customer 이지만 인스턴스 타입은 VIPCustomer 이다.
        // 자바에서는 항상 인스턴스의 메소드가 호출 됨(가상메서드의 원리)
        // 자바의 모든 메서드는 가장 메서드(virtual method) 임
        System.out.println(Koo.showCustomerInfo() + price3);
    }
}
