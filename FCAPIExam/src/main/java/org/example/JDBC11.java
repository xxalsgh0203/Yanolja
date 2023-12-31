package org.example;

import org.example.model.Book;
import org.example.model.BookDAO;
import org.example.model.BookRepository;

import java.util.List;

public class JDBC11 {
    public static void main(String[] args) {
        // 자바 라는 단어가 포함된 모든 책을 검색
        String search = "자바";
        BookRepository repository = new BookDAO();
        List<Book> list = repository.getLikeBooks(search);

        if(list.size() != 0){
            for(Book book : list){
                System.out.println(book);
            }
        }else{
            System.out.println("검색 실패");
        }
    }
}
