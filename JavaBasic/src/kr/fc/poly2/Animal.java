package kr.fc.poly2;

public abstract class Animal { // 추상 클래스  -> 기능이 비슷한 것끼리. 추상클래스는 객체를 생성할 수 없음
    // 1. 추상 메서드
    public abstract void eat(); // 메서드의 머리(원형 / 프로토타입) -> 구현부가 없음

    // 2. 구현 메서드
    public void move(){
        System.out.println("동물이 이동합니다.");
    }
}
