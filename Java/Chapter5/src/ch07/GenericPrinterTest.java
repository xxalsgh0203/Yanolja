package ch07;

//  <T extends 클래스> 사용하기
// 상위 클래스의 필요성
// T 자료형의 범위를 제한 할 수 있음 -> water 이 정의되지 않았는데도 water 을 사용한다던가..이러면 오류발생
// 상위 클래스에서 선언하거나 정의하는 메서드를 활용할 수 있음
// 상속을 받지 않는 경우 T는 Object로 변환되어 Object 클래스가 기본으로 제공하는 메서드만 사용가능
public class GenericPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); // 자료형을 지정해주지 않으면 Object 라고 생각함
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial(); // Object 를 사용할 떄와 다르게 형변환을 해주지 않아도됨
        // 컴파일러가 알아서 replace 해줌
        System.out.println(powderPrinter.toString());

        //GenericPrinter<Water> printer = new GenericPrinter<Water>(); -> 이제 쓸 수 없음
    }
}
