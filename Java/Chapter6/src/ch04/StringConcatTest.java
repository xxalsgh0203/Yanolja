package ch04;

public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatImpl strImple = new StringConcatImpl();
        strImple.makeString("Hello", "World");

        String s1 = "Hello";
        String s2 = "World";

        StringConcat strImpleLamda = (s, v) -> System.out.println(s + ", " + v);
        strImpleLamda.makeString(s1, s2);
        // 람다식이 클래스 생성을 생략하는 것이 아니라 아래 과정이 생략된 것이다

        //        StringConcat concat2 = new StringConcat() {
        //            @Override
        //            public void makeString(String s1, String s2) {
        //
        //            }
        //        }

        // 자바에서는 객체 없이 메서드가 호출 될 수 없음
        //람다식을 구현하면 익명 내부 클래스가 만들어지고, 이를 통해 익명 객체가 생성됨
    }
}
