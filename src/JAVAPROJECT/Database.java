package JAVAPROJECT;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
    public static void main(String args[]){

    }
}

class DBcon{
    Connection connection;

    public void connect(){
        String url ="jdbc:mysql://localhost1521/database?serverTimezone=UTC";
        connection = DriverManager.getConnection(URL,"user","password");
    }
}
