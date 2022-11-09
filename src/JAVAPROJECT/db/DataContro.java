package JAVAPROJECT.db;

import JAVAPROJECT.MenuBar1;

import javax.swing.*;
import java.awt.*;
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
    public DataContro() {
        JPanel jp = new JPanel();
        JButton back = new JButton();

        setTitle("보기");
        setSize(1000, 700);
        setLocation(400, 200);
        setVisible(true);

        back = new JButton("돌아가기");
        jp.add(back, BorderLayout.SOUTH);
        jp.setSize(300, 300);
        jp.setLocation(300, 300);
        jp.setVisible(true);
        add(jp);
        back.setVisible(false);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuBar1("포춘쿠키");
                setVisible(false);
            }
        });

        /*ArrayList<Datasave> list = new ArrayList<Datasave>();*/
        Choice words = new Choice();

        for (Datasave printt : list) {
            words.addItem(printt.getDay() + "번째 " + printt.getWords());
        }
        add(words);
        jp.add(words);
        add(jp);
        jp.setVisible(true);
        jp.setLocation(400, 200);
        setVisible(true);

    }
        public static void main (String args[] ){
            Connection conn = DatabaseCon.connection();
            ArrayList<Datasave> list = new ArrayList<Datasave>();
            PreparedStatement ps = null;
            ResultSet rs = null;


            try {
                ps = conn.prepareStatement("select day, korwords from list"); //DB가 알아먹을 수 있는 말로 변환
                rs = ps.executeQuery();

                while (rs.next()) { //rs.next()가장 중요한 코드였음...ㅣ하
                    int day = rs.getInt(1);
                    String korwords = rs.getString(2);
                    list.add(new Datasave(day, korwords));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null)
                        rs.close();
                    else if (ps != null)
                        ps.close();
                    else if (conn != null)
                        conn.close();
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            for (Datasave model : list) {
                System.out.println(model.getDay() + "번째 문구 : " + model.getWords());
            }

            //choice 스크롤 형식으로 도출시킬게
            /*Choice words = new Choice();*/
      /*  //정말 연동이 안 된다면...
        words.addItem("무엇인가 좋은 결실을 이룰 것 같은 날입니다.");
        words.addItem("모든 일이 생각대로 잘 풀리는 날입니다.");*/


        }
    }

