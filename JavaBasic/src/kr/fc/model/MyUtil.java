package kr.fc.model;

public class MyUtil {
    // 1~10 까지의 총합을 구하여 출력하시오
//    public int Sum(){ // non static
//        int total = 0;
//        for(int i=1; i<=10; i++){
//            total += i;
//        }
//
//        return total;
//    }

    private MyUtil(){};  // static 인 경우 new 로 객체 생성을 못하게 하려면 생성자 메소드를 private 로 해주면 된다
    // "모든" 멤버가 static 일떄만 사용할 수 있음. static 이 없으면 객체가 생성이 되지 않아서 메소드를 사용할 수 없음.

    public static int Sum(int a, int b){ // static -> new 로 객체 생성을 할 필요가 없음
        int total = 0;
        for(int i=a; i<=b; i++){
            total += i;
        }

        return total;
    }
}

// JVM 의 메모리 공간
// 1. 메소드 area -> static zone / non static zone
// 2. stack area
// 3. heap area