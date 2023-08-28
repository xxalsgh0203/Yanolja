package org.example.model;
import java.sql.*;
public class JDBC03 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password = "1q2w3e4r!";
        // 데이터 처리
        int num = 2;
        String SQL = "delete from tblbook where num = 2";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            // 수정 : num 이 1인 책의 저자(본인이름)와 가격을 수정하시오.
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
