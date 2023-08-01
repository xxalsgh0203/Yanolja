package ch05;

// 메서드(함수)의 이름은 주소값을 나타냄
// 메서드는 명령어의 set 이고 프로그램이 로드되면 메서드 영역(코드 영역)에 명령어 set 이 위치
// 해당 메서드가 호출되면 명령어 set 이 있는 주소를 찾아 명령어가 실행됨
// 이때 메서드에서 사용하는 변수들은 스택 메모리에 위치하게 됨
// 따라서 다른 인스턴스라도 같은 메소드의 코드는 같으므로 같은 메소드가 호출됨
// 인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만 메서드 명령어 set 은 처음 한번만 로드됨

// 가상 메서드의 원리
// 가상 메서드 테이블(virtual method table) 에서 해당 메서드에 대한 address 를 가지고 있음
// 재정의된 경우는 재정의 된 메서드의 주소를 가리킴
public class TestMethod {
}
