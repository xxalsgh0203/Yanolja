package ch15;

public class Person {

    String name;
    int money;
    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi, int amount){
        this.money -= amount;
        taxi.take(amount);
    }

    public void showPersonInfo(){
        System.out.println(name + "님은 남은 돈은 " + money + " 입니다.");
    }

}
