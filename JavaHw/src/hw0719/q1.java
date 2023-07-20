package hw0719;




public class q1 {
    public static void main(String[] args) {

        // 1번 방법
        // 아스키 코드 표를 살펴보면 문자 0 ~ 9는 48 ~ 57의 순서로 되어있습니다.
        // 따라서 문자의 아스키 코드에서 문자 '0'의 아스키 코드를 빼주면 원하는 숫자 1을 얻을 수 있습니다.

        char a = '1';
        char b = '1';

        int result = (a - '0') + (b - '0');

        System.out.println(result);

        // 2번 방법
        // 2의 방법을 사용해도 원하는 값을 얻을 수 있지만, 보기 좋은 코드는 아니라고 생각합니다.
        // 자바의 라이브러리중의 Character.getNumericValue() 함수를 사용하면 같은 결과를 좀 더 깔끔한 코드로 얻을 수 있습니다.

        char a2 = '1';
        char b2 = '1';

        int result2 = Character.getNumericValue(a2) + Character.getNumericValue(b2);

        System.out.println(result2);
    }
}



