package kr.fc.java;

import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

import java.util.*;
public class FC27 {
    public static void main(String[] args) {
        // Dog, Cat
        // 1. 내가 직접 만든 API = MyObjectArray
        // 2. Java 에서 제공해주는 API = ArrayList, ?????
        // 3. 다른 회사가 제공해주는 API = ?????
        List list = new ArrayList(); // 부모타입으로 받아서 쓰는게 범용적임
        list.add(new Dog());
        list.add(new Cat());

        Dog d = (Dog)list.get(0);
        d.eat();

        Cat c = (Cat)list.get(1);
        c.eat();
        c.night();

        for(int i=0; i<list.size(); i++){
            Object obj = list.get(i);
            if(obj instanceof Dog){
                ((Dog) obj).eat();
            }else if(obj instanceof Cat){
                ((Cat) obj).eat();
            }
        }
    }
}
