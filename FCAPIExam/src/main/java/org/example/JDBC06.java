package org.example;

import org.example.model.Book;
import org.example.model.BookDAO;

// DAO
public class JDBC06 {
    public static void main(String[] args) {
        // 책 데이터를 받아서 DB 에 저장하시오

        Book book = new Book();
        book.setTitle("인공지능");
        book.setCompany("영진출판사");
        book.setName("이길동");
        book.setPrice(31000);

        // DAO : DB 비지니스 로직(Service)
        BookDAO dao = new BookDAO();
        int cnt = dao.bookRegister(book);

        if(cnt > 0){
            System.out.println("저장 성공");
        }else{
            System.out.println("저장 실패");
        }
    }
}
