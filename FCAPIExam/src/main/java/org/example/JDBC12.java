package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// JDBC
// Java 코드와 SQL Query 분리
// 분리 되어 있는 SQL 을 연결시키는 방법 : 매핑(Mapping)
// Java 코드 <---- Mapping(매핑) -----> SQL 쿼리 분리(XML:Mapper XML file)
//                MyBatis API(WEB)
// ORM : 객체와 테이블을 매핑하는 기술
public class JDBC12 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password = "1q2w3e4r!";

        // 책 전체 목록을 가져오기
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            String SQL = readSqlStatement("db.xml", "selectBooks");

            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String title = rs.getString("title");
                int price = rs.getInt("price");
                System.out.println(title + ":" + price);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static String readSqlStatement(String fileName, String queryId) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(fileName));

            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            String expression = "/queries/select[@id='" + queryId + "']";
            Node node = (Node) xpath.evaluate(expression, document, XPathConstants.NODE);
            if (node != null) {
                return node.getTextContent().trim();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
