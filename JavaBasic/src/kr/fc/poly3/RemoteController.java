package kr.fc.poly3;

public interface RemoteController {
    // TV 와 Radio 의 공통 기능(함수, 메서드)을 정의
    // 서로 다른 객체의 공통 부분을 묶을때
    // 객체를 생성할 수 없다
    // 부모의 역할로 상용 가능하다(Upcasting)
    // 다중 상속을 지원하기 위해서 사용된다
    public void chUp();
    public void chDown();
    public void volUp();
    public void volDown();
}
