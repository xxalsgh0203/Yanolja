package org.example;
import org.example.model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC04 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password = "1q2w3e4r!";
        // 책 전체 리스트를 출력하세요.
        String SQL = "select * from tblbook";
        List<Book> blist = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
            // int cnt = st.executeUpdate(SQL) : insert, update, delete
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                int num = rs.getInt("num");
                String title = rs.getString("title");
                String company = rs.getString("company");
                String name = rs.getString("name");
                int price = rs.getInt("price");

                // 묶고(VO) -> 담고(List)
                Book book = new Book(num, title, company, name, price);
                blist.add(book);
            }

            for(Book book : blist){
                System.out.println(book.toString());
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
