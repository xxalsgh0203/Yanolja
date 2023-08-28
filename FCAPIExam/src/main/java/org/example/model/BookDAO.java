package org.example.model;
// DAO(class) : JDBC -> Mapper(interface) : Mybatis -> Repository(interface) : JPA
//                      Connection POOL -> HikariCP
import java.sql.*;
public class BookDAO { // CRUD
    private Connection conn;
    private Statement st; // 잘 사용하지 x
    private PreparedStatement ps; // SQL 문장에 parameter 가 있는 경우에 사용(?)
    private ResultSet rs;

    public void getConnection(){
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password = "1q2w3e4r!";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void dbClose(){
        try{
            if(rs!=null) rs.close();
            if(ps!=null) ps.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //  저장 기능
    public int bookRegister(Book book){
        // SQL 문장에 들어있는 ? => 파라미터
        // 미완성 SQL                                                          //1 2 3 4
        String SQL = "insert into tblbook(title, company, name, price) values(?,?,?,?)";
        getConnection();
        int cnt = -1;
        try{
            // st = conn.createStatement();
            ps = conn.prepareStatement(SQL); // SQL 을 미리 컴파일 시켜서 받는다
            ps.setInt(1, book.getNum());
            ps.setString(2, book.getCompany());
            ps.setString(3, book.getName());
            ps.setInt(4, book.getPrice());

            cnt = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            dbClose();
        }

        return cnt;
    }
}
