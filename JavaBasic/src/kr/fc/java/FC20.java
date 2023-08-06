package kr.fc.java;

import kr.fc.poly2.*;

public class FC20 {
    public static void main(String[] args) {
        //        Animal ani = new Animal();   -> 오류. 추상클래스는 객체로 사용할 수 없음. 부모역할로 사용해야 함
        Animal ani = new Dog();
        ani.eat(); // 다형성이 보장
        ani = new Cat();
        ani.eat(); // 다형성이 보장

        ((Cat)ani).night();
    }
}
