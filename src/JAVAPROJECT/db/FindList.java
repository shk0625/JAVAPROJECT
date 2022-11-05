package JAVAPROJECT.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

//데이터베이스
public class FindList {

    public static ResultSet get() {
        Connection connection = Database.connection();
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from list");


        }catch (Exception e) {

        }

        return resultSet;
    }
}
