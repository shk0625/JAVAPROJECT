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
        /*Choice words = new Choice();*/
        TextArea words = new TextArea(40,40);


        words.setText("무엇인가 좋은 결실을 이룰 것 같은 날입니다.");
        words.setText("모든 일이 생각대로 잘 풀리는 날입니다.");
        words.setText("오늘보다 내일을 기약하는 것은 어떨까요?");
        words.setText("길게 보는 안목과 혜안이 필요합니다..");
        words.setText("오늘 할 일은 오늘 하는 게 어떨까요?");

        words.setText("모든 사람들로부터 사랑받지 않아도 됩니다.");
        words.setText("미래를 만드는 건 현재입니다.");
        words.setText("운명의 별은 마음속에 있습니다.");
        words.setText("미래는 예측하는 게 아니라 만들어 가는 겁니다.");
        words.setText("피할 수 없으면 즐기는 게 어떨까요?");

        words.setText("고난의 시기에 동요하지않는 건 어떨까요?");
        words.setText("작은 기회를 노려보는 건 어떨까요?");
        words.setText("용기있게 산다면 이룰 것 같은 날입니다.");
        words.setText("애정 운이 최고조에 달하는 날입니다.");
        words.setText("선택과 집중");

        words.setText("집중하면 성공할 것입니다.");
        words.setText("운은 계획에서 비롯됩니다.");
        words.setText("완벽함을 위한 것이 아닌 탁월함을 위해 힘 써보세요.");
        words.setText("반성하는 삶을 살아보는 건 어떨까요?");
        words.setText("자책하지 마세요 누구나 실수는 합니다.");

        words.setText("후회없는 하루를 보내보세요");
        words.setText("무언가를 시작하기 전에 충분한 정리가 필요합니다.");
        words.setText("자기 자신을 사랑한다면 사랑받을 수 있습니다.");
        words.setText("질투와 시기를 자신을 발전시키는 원동력으로 바꿔보는 것은 어떨까요?");
        words.setText("당신은 세상의 소금같은 존재입니다.");

        words.setText("하루하루를 의미있게 보내보세요.");
        words.setText("소중한 사람을 위해 무언가를 준비해보는 것은 어떨까요?");
        words.setText("하루를 의미있게 보내는 방법을 연구해보아요.");
        words.setText("고민보다 Go!");
        words.setText("한계는 또 다른 한계를 찾는 거예요.");

        words.setText("자신이 1순위라는 것을 잊지 말아요.");
        //textarea 겹쳐지무ㅜ.. 다 추가가 되어야하는데...

        words.setFont(new Font("궁서체",Font.BOLD,20));

        add(words);
        jp.add(words);
        add(jp);
        jp.setVisible(true);
        jp.setLocation(400, 200);
        setVisible(true);

        /*setSize(1000, 700);*/

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

