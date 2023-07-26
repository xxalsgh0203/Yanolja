package kr.fc.java;

import kr.fc.model.BookVO;

public class FC10 {
    public static void main(String[] args) {
        // 책 3권을 저장할 배열을 생성하세요.
        BookVO[] books = new BookVO[3];

        books[0] = new BookVO("자바", 23000);
        books[1] = new BookVO("C언어", 25000);
        books[2] = new BookVO("파이썬", 13000);

        for(BookVO book : books){
            System.out.println(book);
        }
    }
}
