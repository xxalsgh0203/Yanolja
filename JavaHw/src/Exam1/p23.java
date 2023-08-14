package Exam1;

import java.awt.print.Book;

public class p23 {
    public static void main(String[] args) {
        BookVO[] books = new BookVO[3];
        books[0] = new BookVO("자바", "한빛미디어", "홍길동", 30000);
        books[1] = new BookVO("JSP", "영진출판사", "이길동", 35000);
        books[2] = new BookVO("C언어", "제이펍", "조길동", 20000);

        for(BookVO book : books){
            System.out.println(book.toString());
        }
    }
}
