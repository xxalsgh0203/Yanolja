package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC15 {
    public static void main(String[] args) {
        // 정보 은닉, 상속, 다형성(추상클래스, 인터페이스)
        Dog d = new Dog();
        printEat(d);

        Cat c = new Cat();
        printEat(c);

        Cat ani = new Cat();
        ani.night();
    }

    // Dog, Cat 객체를 매개변수로 받아서 eat() 를 동작시키는 메서드를 정의
    public static void printEat(Animal animal){ // 다형성 인수
        animal.eat(); // 컴파일 시점에서는 Animal 의 eat() 인데
        // 실행 시점에서는 자식의 eat() 가 실행된다 -> 동적바인딩
    }
}
