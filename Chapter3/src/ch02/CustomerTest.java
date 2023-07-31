package ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer Lee = new Customer();
        Lee.setCustomerID(1001);
        Lee.setCustomerName("이순신");
        Lee.setBonusPoint(1000);
        System.out.println(Lee.showCustomerInfo());

        VIPCustomer Kim = new VIPCustomer();
        Kim.setCustomerID(1002); // VIPCusomer class 에 정의된 함수는 아니지만 상속받아서 이미 만들어져있어 사용가능
        Kim.setCustomerName("김유신");
        Kim.setBonusPoint(2000);
        System.out.println(Kim.showCustomerInfo());
    }
}
