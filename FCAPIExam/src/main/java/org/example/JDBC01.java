package org.example;
// JDBC Programming

import java.sql.*; // interface(규약) ------> Driver
public class JDBC01 {
    public static void main(String[] args) {
        // 1. JDBC 드라이버 설치(API)
        // 2. 자바에서 DB 에 접속하려면 접속URL, username, password
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password = "1q2w3e4r!";

        String title = "C언어";
        String company = "이지스퍼블리싱";
        String name = "홍길동";
        int price = 35000;
        // 3. 드라이버 로딩(mysql 드라이버 클래스를 메모리에 로딩) : 객체를 생성
        // 정적 로딩 : 컴파일할때 어떤 드라이버 클래스를 쓸지 정하는 것 -> 컴파일 시점에 드라이버가 반드시 존재해야함
        // DriverManager driver = new com.mysql.cj.jdbc.Driver();
        // 동적 로딩 : 실행시점에 클래스가 만들어짐
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 1. 연결 객체를 생성
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("연결성공");

            // 2. SQL 문장 만들기
            String SQL = "insert into tblbook(title, company, name, price) values('" + title + "','" + company + "','" + name + "'," +price + ")";

            // 3. SQL 문장 전송 객체를 생성
            Statement st = conn.createStatement();
            int cnt = st.executeUpdate(SQL); // 실행
            if(cnt > 0){
                System.out.println("입력 성공");
            }else{
                System.out.println("입력 실패");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
