package org.example.model;
// DAO(class) : JDBC -> Mapper(interface) : Mybatis -> Repository(interface) : JPA
//                      Connection POOL -> HikariCP

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// JDBC :  생산성이 떨어진다(시간이 소비된다). 유지보수가 어렵다
public class BookDAO implements BookRepository{ // CRUD
    private Connection conn;
    private Statement st; // 잘 사용하지 x
    private PreparedStatement ps; // SQL 문장에 parameter 가 있는 경우에 사용(?)
    private ResultSet rs;

    public void getConnection() {
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password = "1q2w3e4r!";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dbClose() {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public int bookUpdate(Book vo) {
        String SQL = "update tblbook set company=?,name=?,price=? where num=?";
        int cnt = -1;
        getConnection();
        try {
            ps = conn.prepareStatement(SQL);
            ps.setString(1, vo.getCompany());
            ps.setString(2, vo.getName());
            ps.setInt(3, vo.getPrice());
            ps.setInt(4, vo.getNum());
            cnt = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbClose();
        }

        return cnt;
    }

    // 특정 레코드 1개만 가져오는 기능
    public Book findByNum(int num) {
        Book book = null;
        String SQL = "select * from tblbook where num=?";
        getConnection();
        try {
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, num);
            rs = ps.executeQuery();
            if (rs.next()) {
                num = rs.getInt("num");
                String title = rs.getString("title");
                String company = rs.getString("company");
                String name = rs.getString("name");
                int price = rs.getInt("price");

                // 묶고(VO) -> 담고(List)
                book = new Book(num, title, company, name, price);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbClose();
        }

        return book;
    }

    //  저장 기능
    public int bookRegister(Book book) {
        // SQL 문장에 들어있는 ? => 파라미터
        // 미완성 SQL                                                          //1 2 3 4
        String SQL = "insert into tblbook(title, company, name, price) values(?,?,?,?)";
        getConnection();
        int cnt = -1;
        try {
            // st = conn.createStatement();
            ps = conn.prepareStatement(SQL); // SQL 을 미리 컴파일 시켜서 받는다
            ps.setInt(1, book.getNum());
            ps.setString(2, book.getCompany());
            ps.setString(3, book.getName());
            ps.setInt(4, book.getPrice());

            cnt = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbClose();
        }

        return cnt;
    }

    // 전체 리스트를 가져오는 메서드를 정의
    public List<Book> bookList() {
        String SQL = "select * from tblbook";
        getConnection();
        List<Book> blist = new ArrayList<>();
        try {
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int num = rs.getInt("num");
                String title = rs.getString("title");
                String company = rs.getString("company");
                String name = rs.getString("name");
                int price = rs.getInt("price");

                // 묶고(VO) -> 담고(List)
                Book book = new Book(num, title, company, name, price);
                blist.add(book);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbClose();
        }

        return blist;
    }

    @Override
    public int bookDelete(int num) {
        String SQL = "delete from tblbook where num=?";
        int cnt = -1;
        getConnection();
        try{
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, num);
            cnt = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            dbClose();
        }
        return cnt;
    }

    @Override
    public List<Book> getLikeBooks(String search) {
        String SQL = "select * from where title like ?";
        getConnection();
        List<Book> blist = new ArrayList<>();
        try {
            ps = conn.prepareStatement(SQL);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                int num = rs.getInt("num");
                String title = rs.getString("title");
                String company = rs.getString("company");
                String name = rs.getString("name");
                int price = rs.getInt("price");

                // 묶고(VO) -> 담고(List)
                Book book = new Book(num, title, company, name, price);
                blist.add(book);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbClose();
        }
        return blist;
    }
}
