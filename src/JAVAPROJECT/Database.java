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
        String url="jdbc:mysql://localhost/dev?useSSL=false";
//        connection = DriverManager.getConnection(url,"user","password");
    }
}
