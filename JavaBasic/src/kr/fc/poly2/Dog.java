package kr.fc.poly2;

import kr.fc.poly2.Animal;

public class Dog extends Animal {
    private String name;
    private int age;

    public Dog(){
        super(); // new Animal();
    }

    @Override
    public void eat(){
        System.out.println("개처럼 먹다.");
    }
}
