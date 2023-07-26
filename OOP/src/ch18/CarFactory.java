package ch18;

public class CarFactory {

    private CarFactory(){} // private 로 지정해서 싱글톤패턴 디자인
    private static CarFactory instance = new CarFactory(); // 유일한 객체.

    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }

        return instance;
    }

    public Car createCar(){
        Car car = new Car();
        return car;
    }
}
