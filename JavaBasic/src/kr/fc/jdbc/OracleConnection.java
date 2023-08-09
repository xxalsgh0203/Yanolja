package kr.fc.jdbc;

// MySQL 용 JDBC Driver class -> (API)
public class OracleConnection implements JdbcConnection{
    @Override
    public void getConnection(String URL, String username, String password) {
        System.out.println("URL, username, password 정보로 Oracle 연결을 시도한다.");
    }
}
