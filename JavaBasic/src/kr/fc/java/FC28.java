package kr.fc.java;

import kr.fc.model.BookVO;

import java.util.ArrayList;
import java.util.List;

public class FC28 {
    public static void main(String[] args) {
        // ArrayList 를 이용해서 Book 3권을 저장하고 출력하세요.
        // 객체배열은 크기에 제한이 있음
        List<BookVO> list = new ArrayList<BookVO>();
        list.add(new BookVO("Java의정석", 30000));
        list.add(new BookVO("Oracle의정석", 30000));
        list.add(new BookVO("C의정석", 30000));

//        list.remove(1);

        list.add(2, new BookVO("Python", 40000));
        for(int i=0; i<list.size(); i++){
            BookVO book = list.get(i);
            System.out.println(book);
        }
    }
}
// 키보드로 데이터를 입력받는 방법 : I/O - Scanner API
// 파일, 네트워킹 -> 입출력하는 방법 : Stream(스트림) - 크롤링, Open API
