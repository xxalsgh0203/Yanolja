package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC19 {
    public static void main(String[] args) {
        // 2. 다형성 인수
        Dog d = new Dog();
        Cat c = new Cat();
        // Animal[], Object[]
        display(d);
        display(c);
    }

    private static void display(Animal a){
        // 재정의를 하지 않으면 다형성을 보장하지 않는다 -> 추상클래스, 인터페이스를 사용하는 이유. 무조건 재정의하게 하기 위함
        a.eat(); // 다형성, 동적바인딩(상속, 재정의(?), upcasting)
        if(a instanceof Dog){
            a.eat();
        }else if(a instanceof Cat){
            a.eat();
            ((Cat) a).night();
        }
    }
}
