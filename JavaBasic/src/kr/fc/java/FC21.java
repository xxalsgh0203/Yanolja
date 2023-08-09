package kr.fc.java;

import kr.fc.poly3.Radio;
import kr.fc.poly3.RemoteController;
import kr.fc.poly3.TV;

public class FC21 {
    public static void main(String[] args) {
        // TV tv = new TV();    RemoteController X
        // 리모콘으로 TV 클래스를 동작시켜보세요.
        // 다형성 ? -> 클래스, 상속, 재정의, Upcasting, 동적바인딩
        // 다형성 사용하는 이유? 하위클래스의 동작방식을 몰라도 하위클래스의 동작방식으로 상위클래스를 동작시킬수 있음

        RemoteController tv1 = new TV();
        tv1.chUp();
        tv1.chDown();
        tv1.volUp();
        tv1.volDown();
        // 실행하기 전단계에서는 이 4단계는 리모콘의 것.
        // 실행 한 후에는 하위 클래스가 동작 -> 동적 바인딩 ( 실행 시점에서 사용 메소드가 결정됨) -> 프로그램의 속도를 떨어뜨리는 원인
        // 그럼에도 편리성 때문에 사용한다

        RemoteController radio1 = new Radio();
        radio1.chUp();
        radio1.chDown();
        radio1.volUp();
        radio1.volDown();
    }
}
