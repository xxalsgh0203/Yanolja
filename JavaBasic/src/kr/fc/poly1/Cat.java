package kr.fc.poly1;

public class Cat extends Animal{

    public Cat(){
        super();
    }

    public Cat(String name, int age){
        super(name, age);
    }
    public void night(){
        System.out.println("밤에 눈에서 빛이 난다.");
    }
    @Override
    public void eat(){
        System.out.println("고양이 처럼 먹다.");
    }
}
