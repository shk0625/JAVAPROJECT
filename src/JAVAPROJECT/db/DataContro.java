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
        jp.add(back, BorderLayout.EAST);
        jp.setSize(300, 300);
        jp.setLocation(300, 300);
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


        //31개의 데이터들을 choice에 넣는 거
        /*ArrayList<Datasave> list = new ArrayList<Datasave>();*/
        /*for (Datasave printt : list) {
            words.addItem(printt.getDay() + "번째 " + printt.getWords());
        }*/
        Choice words = new Choice();
        words.addItem("무엇인가 좋은 결실을 이룰 것 같은 날입니다.");
        words.addItem("모든 일이 생각대로 잘 풀리는 날입니다.");
        words.addItem("오늘보다 내일을 기약하는 것은 어떨까요?");
        words.addItem("길게 보는 안목과 혜안이 필요합니다..");
        words.addItem("오늘 할 일은 오늘 하는 게 어떨까요?");

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


        }
    }

