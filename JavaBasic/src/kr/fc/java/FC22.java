package kr.fc.java;

import kr.fc.jdbc.JdbcConnection;
import kr.fc.jdbc.MySQLConnection;
import kr.fc.jdbc.OracleConnection;

public class FC22 {
    public static void main(String[] args) {
        // Oracle DBMS 접속
        JdbcConnection oracleConn = new OracleConnection();
        oracleConn.getConnection("URL", "admin", "1234");

        // MySQL DBMS 접속
        JdbcConnection mysqlConn = new MySQLConnection();
        mysqlConn.getConnection("URL", "admin", "1234");
    }
}
