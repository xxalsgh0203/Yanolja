package kr.fc.jdbc;

public interface JdbcConnection {
    public void getConnection(String URL, String username, String password); // 데이터베이스 연결동작
}
