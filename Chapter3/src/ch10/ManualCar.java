package ch10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전 합니다.");
        System.out.println("사람이 핸들을 움직여 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 운전자가 브레이크를 밟아 멈춥니다");
    }

    @Override
    public void wiper() {
        System.out.println("운전자가 와이퍼를 켭니다.");
    }
}
