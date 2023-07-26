package ch18;

// 자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작할 때마다 고유의 번호가 부여됩니다.
// 자동차 번호가 10001 부터 시작되어 자동차가 생산될 때마다 10002, 10001 이렇게 번호가 붙도록 자동차 공장 클래스, 자동차 클래스를 구현하세요
// 다음 CarFactoryTest.java 테스트 코드가 수행되도록 합니다.
public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance(); // 싱글톤패턴!!
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum()); // 10001 출력
        System.out.println(yourSonata.getCarNum()); // 10002 출력
    }
}
