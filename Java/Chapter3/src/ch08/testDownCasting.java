package ch08;


// 다운 캐스팅 (downcasting)
// 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
// 하위 클래스로의 형 변환은 명시적으로 해야 함

//        Customer vc = new VIPCustomer();              //묵시적
//        VIPCustomer vCustomer = (VIPCustomer)vc;      //명시적

import java.util.ArrayList;

public class testDownCasting {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerT = new Customer(10010, "Thomas");
        Customer customerJ = new Customer(10020, "James");
        Customer customerE = new GoldCustomer(10030, "Edward");
        Customer customerP = new GoldCustomer(10040, "Percy");
        Customer customerK = new VIPCustomer(10050, "Kim");

        customerList.add(customerT);
        customerList.add(customerJ);
        customerList.add(customerE);
        customerList.add(customerP);
        customerList.add(customerK);

//        Customer customer1 = (VIPCustomer) customerT;

        if(customerE instanceof GoldCustomer){
            GoldCustomer vc = (GoldCustomer) customerE;
            System.out.println(vc.showCustomerInfo());
        }
    }

}
