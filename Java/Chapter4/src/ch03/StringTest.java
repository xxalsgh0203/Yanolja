package ch03;

public class StringTest {
    public static void main(String[] args) {
        // 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법

        // 힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐
        String str1 = new String("abc"); // 힙에 생성
        String str2 = new String("abc");

        System.out.println(str1 == str2);

        String str3 = "abc"; // 상수 풀에 생성
        String str4 = "abc";

        System.out.println(str3 == str4);

    }
}
