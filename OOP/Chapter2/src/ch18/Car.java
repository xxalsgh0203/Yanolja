package ch18;

public class Car {
    private static int CarNo = 10000; // static 으로 해야 모든 객체가 공유할 수 있음
    private int CarNum;

    public Car(){ // Car 인스턴스 생성할때마다 CarNo 증가. 인스턴스에 해당 CarNo 번호 부여.
        CarNo++;
        this.CarNum = CarNo;
    }

    public int getCarNum(){
        return CarNum;
    }

}
