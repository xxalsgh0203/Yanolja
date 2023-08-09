package kr.fc.java;

import kr.fc.poly4.A;
import kr.fc.poly4.B;

public class FC23 {
    public static void main(String[] args) {
        // Object Casting(객체형변환) : Up Casting , Down Casting

        // A 객체를 생성하는데 Upcasting 으로 생성하세요
        Object a = new A(); // Up Casting -> 자동
        ((A) a).display(); // Down Casting

        // B 객체를 생성하는데 Up Casting 으로 생성하세요
        Object b = new B(); // Up Casting -> 자동
        ((B) b).display(); // Down Casting

        A a1 = new A();
        B b1 = new B();
        ptr(a1);
        ptr(b1);

        Object[] obj = new Object[2];
        obj[0] = new A();
        obj[1] = new B();
    }

    public static void ptr(Object obj){ // Upcasting 으로 넘어옴
        if(obj instanceof A){
            ((A) obj).display();
        }else if(obj instanceof B){
            ((B) obj).display();
        }
    }
}
