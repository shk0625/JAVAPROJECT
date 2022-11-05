package JAVAPROJECT.db;

import java.sql.*;
import java.util.Map;

//데이터베이스
public class FindList {

    public static String get() {
        Connection connection = Database.connection();
        ResultSet resultSet = null;
        try {
            String sql = "select * from list order by rand() limit 1";

            PreparedStatement preparedStatement = connection.prepareStatement(sql); //DB가 알아먹을 수 있는 말로 변환
            resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                return resultSet.getString(2);
            }

            if (resultSet != null) {
                resultSet.close();
            } else if (preparedStatement != null) {
                preparedStatement.close();
            } else if (connection != null) {
                connection.close();
            }

        }catch (SQLException e) {
            System.out.println("e = " + e);
        }

        return null;
    }
}
