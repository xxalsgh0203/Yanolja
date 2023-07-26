package kr.fc.java;

import kr.fc.model.MyUtil;

public class FC11 {
    public static void main(String[] args) {
        // API/별도 헬퍼 클래스 를 만들어 1~10까지의 총합을 구하여 출력하시오

//        MyUtil my = new MyUtil();
//        int total = my.Sum();
//
//        System.out.println(total);

         int total = MyUtil.Sum(1, 10);   // -> MyUtil 이 static 인 경우
         // static 인 경우 new 를 못하게 하려면 생성자 메소드를 private 로 해주면 된다

        System.out.println(total);
    }
}
