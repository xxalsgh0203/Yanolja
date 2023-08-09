package kr.fc.poly3;

public class Radio implements RemoteController{
    @Override
    public void chUp() {
        System.out.println("RADIO 의 채널을 증가시킨다");
    }

    @Override
    public void chDown() {
        System.out.println("RADIO 의 채널을 감소시킨다");
    }

    @Override
    public void volUp() {
        System.out.println("RADIO 의 소리를 증가시킨다");
    }

    @Override
    public void volDown() {
        System.out.println("RADIO 의 소리를 감소시킨다");
    }
}
