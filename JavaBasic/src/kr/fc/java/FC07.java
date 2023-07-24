package kr.fc.java;

public class FC07 {
    public static void main(String[] args) {
        // main 은 왜 static 일까?
        // 메인이 프로그램에 시작이기 때문에
        // jvm 이 클래스를 메모리에 올리는데 07 번 클래스에서 스태틱을 먼저 찾고 method area (static zone, none static zone)
        // 으로 나누어 로딩한다.
        // 로딩할때 어떤 메소드가 어떤 클래스에 소속되었는지 클래스이름 레이블이 붙음. 이 메소드는 A 라는 클래스의 메소드, 이 메소드는 B
        // 클래스의 메소드..
        // main 또한 static zone 에 올라간다.
        // JVM 이 static zone 에서 main 을 call 하고 stack 메모리에 푸시된다.

        // 변수, 배열, 메서드
        // 배열 선언, 생성, 초기화
        // 3개의 정수를 배열에 초기화 하시오
        int[] arr = {10, 20, 30}; // [] : 1차원 배열 -> Vector, List, Array...
        // [][] : 2차원 배열 -> table, matrix(행렬)
        // int[] arr = new int[]{10, 20, 30};
        int v = FC07.add(arr); // 매개변수전달기법(번지전달 : Call By Reference)
        System.out.println(v);
    }

    public static int add(int[] arr){
        int result = 0;
        for (int a : arr) {
            result += a;
        }

        return result;
    }

}
