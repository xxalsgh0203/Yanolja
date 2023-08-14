package Exam1;

public class p16 {
    public static void main(String[] args) {
        String s = "Hello Java";
        int len = s.length();
        System.out.println(new StringBuilder(s).reverse().toString());
    }
}

// 자바에서 String 객체는 변경 불가능하다. 한 번 생성되면 내용을 바꿀 수 없단 뜻이다. 따라서 하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고, 이전 문자열은 가비지 컬렉터로 들어간다.
// -> 많은 문자열을 연결하면 많은 중간 문자열 객체가 생성되어 비효율적인 코드가 생성된다