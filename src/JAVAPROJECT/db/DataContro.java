package JAVAPROJECT.db;

import JAVAPROJECT.MenuBar1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;

//31개의 데이터베이스 단어들을 모두 출력할거임.
public class DataContro extends JFrame {
    public DataContro(){
        JPanel jp = new JPanel();
        JButton back = new JButton();

        setTitle("보기");
        setSize(1000,700);
        setLocation(400,200);
        setVisible(true);

        back = new JButton("돌아가기");
        jp.add(back); jp.setSize(300,300);
        jp.setLocation(300,300);
        jp.setVisible(true);
        add(jp);
        back.setVisible(true);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuBar1("포춘쿠키");
                setVisible(false);
            }
        });

    }
    public static void main(String args[]) {


        Connection conn = DatabaseCon.connection();

        ArrayList<Datasave> list = new ArrayList<Datasave>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int index = 1;

        try {
            con=DatabaseCon.connection();
            StringBuffer sql = new StringBuffer();
            sql.append("select day,korwords from list");
            ps=con.prepareStatement(sql.toString());
            rs=ps.executeQuery();

            while(rs.next()){
                index = 1;
                int day = rs.getInt(index++);
                String korwords = rs.getString(index++);

                list.add(new Datasave(day,korwords));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                if(rs != null)
                    rs.close();
                else if(ps!=null)
                    ps.close();
                else if(con!=null)
                    con.close();
            }catch (SQLException e2){
                e2.printStackTrace();
            }
        }
        for(Datasave model:list){
            System.out.println(model.getDay()+"번째 "+model.getWords());
        }
    }
}
