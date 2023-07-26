package kr.fc.java;

import kr.fc.model.BookVO;
public class FC09 {
    public static void main(String[] args) {
        // 데이터 : 기본자료 -> 객체자료
        // 책 1권을 저장할 [변수를 선언] 하세요.

        BookVO b1; // b1 : 객체변수
        b1 = new BookVO();
        BookVO b2; // b2 : 객체변수
        b2 = new BookVO();
        // 객체 생성 후에는 b1 과 b2 가 구분이 됨
        // b1 과 b2 를 인스턴스 변수라고 부름. -> 객체와 인스턴스의 차이?
        // 메모리를 바라보는 관점에서 다르게 쓰임
        // 객체가 구체적인 실체를 가르키면 인스턴스 변수

        // 객체는 Heap 메모리에 생성이 됨.
        // JVM 가 사용하는 메모리 영역 : 1. Method Area 2. Stack Area 3. Heap Area
        // 객체가 생성되면 자기 자신을 가르키는 객체가 하나 만들어짐. (this)

        // b1.title = "자바";
        // b1.price = 12340; // 유효하지 않은 데이터가 저장될 가능성이 있다.
        // System.out.println(b1.title + "\t" + b1.price);
        // title 과 price 가 private 이기 때문에 setter method 가 필요함
        // 반대로 정보은닉된 데이터를 가져오기 위해서는 getter method 가 필요함

        b1.setTitle("자바");
        b1.setPrice(10000);

        System.out.println(b1.getPrice());
        System.out.println(b1.getTitle());

        BookVO b3 = new BookVO("C언어", 13000);

        System.out.println(b1); // b1.toString()
    }
}
