package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC16 {
    // Dog 객체를 생성하는 방법 3가지
    public static void main(String[] args) {
        // 1. 직접 접근
        Dog d1 = new Dog();
        // 2. 간접 접근(Upcasting) -> 자동 형변환
        Animal d2 = new Dog();
        // 3. 자바에서 제공하는 root 클래스
        Object d3 = new Dog();

        d1.eat();
        d2.eat(); // 동적 바인딩

        d2 = new Cat();
        d2.eat();
        // 다형성 : 상위클래스가 동일한 메세지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리

        // 다운캐스팅 -> 강제 형변환
        // 부모가 자식의 메서드를 이용해야 할때
        Cat c1 = (Cat)d2;
        c1.night(); // 다운캐스팅하면 자식 메서드를 이용할 수 있다
        // ((Cat) d2).night(); 와 같다
    }

}

// Animal d1 = new Dog(); -> 컴파일 시점에서는 Animal 의 eat() 이 사용되지만
// 실행시점에서는 Dog 의 eat() 이 실행됨. 오버라이딩이 되어 있기 떄문에
// 실제 가리키고 있는 것은 Animal 의 eat().
// 실제로 Dog 의 eat() 은 가려졌지만 부모의 eat() 이 오버라이딩 되어있기 때문
// 동적 바인딩 : 실행 시점에서 사용될 메소드가 결정되는 바인딩
