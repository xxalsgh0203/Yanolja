package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Dog;

public class FC16 {
    // Dog 객체를 생성하는 방법 3가지

    // 1.
    Dog d2 = new Dog(); // 직접 접근
    // 2.
    Animal d1 = new Dog(); // 간접 접근(Upcasting)
    // 3.
    Object d3 = new Dog(); // 자바에서 제공하는 root 클래스
}
