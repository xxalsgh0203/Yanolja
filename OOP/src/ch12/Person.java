package ch12;

public class Person {
    String name;
    int age;

    public Person(){
        // 생성자에서 다른 생성자 부르기
        this("no name", 1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name + "," + age);
    }

    // 자기 자신을 반환하는 THIS
    public Person getPerson(){
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();
    }

}
