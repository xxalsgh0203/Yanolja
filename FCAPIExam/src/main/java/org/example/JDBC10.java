package org.example;

import org.example.model.Book;
import org.example.model.BookDAO;
import org.example.model.BookRepository;

import java.util.List;

public class JDBC10 {
    public static void main(String[] args) {
        // 특정 레코드 삭제
        int num = 5;
        BookRepository repository = new BookDAO(); // 계속 new 해서 쓰니까 싱글톤 패턴이 나음.
        int cnt = repository.bookDelete(num);

        if(cnt > 0) {
            System.out.println("삭제성공");
            List<Book> list = ((BookDAO)repository).bookList();
            for(Book vo : list){
                System.out.println(vo);
            }
        }
        else
            System.out.println("삭제실패");
    }
}
