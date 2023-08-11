package kr.fc.java;

import kr.fc.model.BookVO;
import kr.fc.poly4.B;

import java.util.Scanner;

public class FC29 {
    public static void main(String[] args) {
        // 키보드로 부터 데이터를 입력
        // 키보드(외부장치) : System.in / 모니터장치(콘솔) : System.out
        Scanner scanner = new Scanner(System.in); // 키보드로부터 입력받기 위해 scanner 객체 생성 후 생성자 통해 연결
        System.out.println("책 제목 : ");
        String title = scanner.nextLine(); // blocking(블럭킹)
        System.out.println("책 가격 : ");
        String price = scanner.nextLine();

        // title, price 를 하나의 구조로 묶어주는 것
        BookVO vo = new BookVO(title, Integer.parseInt(price));
        System.out.println(vo);
    }
}
