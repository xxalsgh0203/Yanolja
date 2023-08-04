package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC17 {
    public static void main(String[] args) {
        // 1. 다형성 배열
        // Dog, Cat 을 저장할 배열을 생성하세요
        Animal[] animals = new Animal[2];
        animals[0] = new Dog(); // eat()
        animals[1] = new Cat(); // eat(), night()

        for(Animal animal : animals){
            if(animal instanceof Cat){
                ((Cat) animal).night();
            }
            animal.eat();
        }


    }
}
