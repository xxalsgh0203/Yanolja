package kr.fc.poly1;

public class Dog extends Animal{
    private String name;
    private int age;

    public Dog(){
        super();
    }

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("개처럼 먹다.");
    }
}
