package kr.fc.poly1;

public class Animal {
    // 객체의 초기화는 객체 자기 자신이 하는 것이 이상적이다.
    private String name;
    private int age;

    public Animal(){}
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("동물처럼 먹다");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
