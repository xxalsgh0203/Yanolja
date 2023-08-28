package org.example;

import org.example.model.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBC05 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password = "1q2w3e4r!";
        // num = 1 인 책 한권 출력하시오
        String SQL = "select * from tblbook where num = 4";
//        List<Book> blist = new ArrayList<>();
        Book book = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
            // int cnt = st.executeUpdate(SQL) : insert, update, delete
            ResultSet rs = st.executeQuery(SQL);
            if(rs.next()){
                int num = rs.getInt("num");
                String title = rs.getString("title");
                String company = rs.getString("company");
                String name = rs.getString("name");
                int price = rs.getInt("price");

                // 묶고(VO) -> 담고(List)
                book = new Book(num, title, company, name, price);
            }
            if(book != null){
                System.out.println(book.toString());
            }else{
                System.out.println("데이터가 없습니다.");
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
