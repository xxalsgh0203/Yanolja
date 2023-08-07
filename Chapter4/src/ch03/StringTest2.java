package ch03;

public class StringTest2 {
    public static void main(String[] args) {
        // 한번 생성된 String은 불변(immutable)
        // String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨 ( 메모리 낭비가 발생할 수도 )
        // == > StringBuilder, StringBuffer 사용

        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));

        System.out.println(System.identityHashCode(java));


        System.out.println(System.identityHashCode(java));
        java = java.concat(android);
        System.out.println(java);
        System.out.println(System.identityHashCode(java));
        // 다른 주소를 가리킴 -> 메모리 낭비
    }
}
