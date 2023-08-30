package org.example;

import org.example.model.Book;
import org.example.model.BookDAO;

import java.util.List;

public class JDBC08 {
    public static void main(String[] args) {
        // 수정 기능
        // 클라이언트로부터 넘어온 데이터 : Form parameter
        int num = 5;
        String company = "대림출판사";
        String name = "나길동";
        int price = 42000;
        // 묶어서(VO, DTO) -> DAO
        // 파라메터 수집 => 스프링에서는 자동으로 수집
        Book book = new Book();
        book.setNum(num);
        book.setCompany(company);
        book.setName(name);
        book.setPrice(price);

        BookDAO dao = new BookDAO();
        int cnt = dao.bookUpdate(book);

        if(cnt > 0){
            System.out.println("수정 완료");
            List<Book> list = dao.bookList();
            for(Book vo : list){
                System.out.println(vo.toString());
            }
        }else{
            System.out.println("수정 실패");
        }
    }
}
