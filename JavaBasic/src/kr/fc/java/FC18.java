package kr.fc.java;

import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC18 {
    public static void main(String[] args) {
        // Dog, Cat -> Object[] : Object -> Downcasting
        Object[] objects = new Object[2];

        objects[0] = new Dog(); // upcasting, eat()
        objects[1] = new Cat(); // upcasting, eat(), night()

        for(int i=0; i<objects.length; i++){
            if(objects[i] instanceof Dog){
                ((Dog) objects[i]).eat();
            }else if(objects[i] instanceof Cat){
                ((Cat) objects[i]).eat();
                ((Cat) objects[i]).night();
            }
        }
    }
}
