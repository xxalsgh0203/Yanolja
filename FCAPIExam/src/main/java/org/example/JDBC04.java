package org.example;
import java.sql.*;
public class JDBC04 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password = "1q2w3e4r!";
        // 책 전체 리스트를 출력하세요.
        String SQL = "select * from tblbook";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
            int cnt = st.executeUpdate(SQL);
            if(cnt > 0){
                System.out.println("삭제 완료:" + cnt);
            }else{
                System.out.println("수정 실패");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
