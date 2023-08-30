package org.example;

import org.example.model.Book;
import org.example.model.BookDAO;

public class JDBC09 {
    public static void main(String[] args) {
        int num = 5;
        BookDAO dao = new BookDAO();
        Book book = dao.findByNum(num);
        if(book != null){
            System.out.println(book);
        }else{
            System.out.println("검색 실패");
        }
    }
}
