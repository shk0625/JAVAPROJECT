package JAVAPROJECT.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
