package kr.fc.poly2;

import kr.fc.poly2.Animal;

public class Cat extends Animal implements Pet {
    public void night(){
        System.out.println("밤에 눈에서 빛이 난다.");
    }
    @Override
    public void eat(){
        System.out.println("고양이 처럼 먹다.");
    }

    @Override
    public void play(){

    }
}
