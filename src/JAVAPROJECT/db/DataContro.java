package JAVAPROJECT.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;


public class DataContro {
    Connection conn = DatabaseCon.connection();

    ArrayList<Datasave> list = new ArrayList<Datasave>();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs= null;
    

}
