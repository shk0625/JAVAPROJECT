package JAVAPROJECT.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseCon {
    public static Connection connection() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:1521/fortune";
        String user = "root";
        String pw = "23456789";
        Connection con = null;

        try {
             Class.forName(driver);
            System.out.println("db연결중");
            con=DriverManager.getConnection(url,user,pw);
            System.out.println("성공");

        } catch (ClassNotFoundException e) {
            System.out.println("jdbc 드라이버 연결 실패");

        } catch (SQLException e){
            System.out.println("연결실패 ");
        }

        return con;
    }
}