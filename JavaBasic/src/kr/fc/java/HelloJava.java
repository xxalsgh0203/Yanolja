package kr.fc.java;
import kr.fc.model.BookVO;

public class HelloJava { // 메인, 시작클래스
    public static void main(String[] args) { // main 이 있어야 시작 클래스가 된다
        // Hello Java 라는 문자열을 출력하기 1) 파일 2) DB 3) GUI 4) PC 에서 다른 PC 로 전송 5) 콘솔
        System.out.println("Hello Java"); // 출력 스트림(Stream) : 빨대
        String a = "apple"; // java.lang 은 default package 이기 때문에 import java.lang.* 은 생략이 되어 있음
        // ArrayList list;  -> 오류 발생. ArrayList 는 java.lang 패키지 안에 없기 때문에.
        // 따라서 import 해주거나 java.util.ArrayList 사용해야함 . 이것이 API 를 사용하는 방법
        // java.util.ArrayList 를 클래스의 full name 이라고 함.
        // Java 의 API 는 package 안에 있기 때문에 full name 을 알아야함.


        // import * 해주면 메모리 낭비가 발생할 수 있음.

        BookVO book; // 객체 생성
    }
}

// JDK -> 컴파일 시킴 -> HelloJava.java 를 HelloJava.class 파일로 바꿈. 바로 실행파일인 exe 로 만들지 않고
// 각 운영체제 마다 다른 파일을 생성하기 위해 중간어코드인 class 를 생성 후 JVM 이 운영체제에 맞게 다시 한번 더 컴파일


//    스프링 앱 개발 관점에서 빌드(build)와 컴파일(compiler)의 차이점입니다.
//
//        빌드(build)는 소프트웨어의 “배포 가능한” 버전을 만들기 위해 필요한 모든 단계를 포함하는 프로세스입니다.
//        자바에서 이는 일반적으로 다음과 같은 단계를 포함합니다:
//
//        1. 소스 생성
//        2. 소스 컴파일
//        3. 테스트 소스 컴파일
//        4. 테스트 실행 (단위 테스트, 통합 테스트 등)
//        5. 패키징 (jar, war 등)
//        5. health check 실행 (Checkstyle, Findbugs, PMD와 같은 정적 분석기, 테스트 커버리지 등)
//        6. 보고서 생성
//        따라서 컴파일은 빌드의 일부에 해당합니다.
//        모든 단계를 Maven이나 Gradle와 같은 도구로 완전히 자동화하고 지속적으로 빌드를 실행하는 것이 좋습니다(Continuous Integration으로 알려져 있음)
//
//        컴파일(compile)은 소스 코드를 오브젝트 코드로 변환하는 작업입니다
//        링크(linking)는 오브젝트 코드와 라이브러리를 결합하여 실행 가능한 파일을 만드는 작업입니다
//        빌드(building)는 컴파일과 링크, 그리고 설치 프로그램 생성과 같은 다른 작업들을 포함하는 순서입니다
//
//
//        즉, 컴파일은 빌드 과정의 일부에 불과하며, 빌드는 컴파일을 포함하여 다른 작업들도 포함하는 전체적인 프로세스입니다