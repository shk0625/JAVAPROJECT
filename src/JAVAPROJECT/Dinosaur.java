package JAVAPROJECT;

import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static JAVAPROJECT.util.ImagePrint.포춘공룡;

public class Dinosaur extends JFrame {
    public Dinosaur(){
        JPanel jpimage = new JPanel();
        JPanel jpback=new JPanel(new BorderLayout());
        JPanel jptext = new JPanel(); //label 붙일 거 TMI
        JLabel jlimage = new JLabel();
        JLabel jltext = new JLabel();

        setTitle("포춘공룡");
        setSize(1000,700); //window창 크기
        setLocation(400,200);
        jpimage.setSize(800,800); //공룡크기

        jlimage= new JLabel(ImageUtil.getImageNumber(포춘공룡),SwingConstants.CENTER);
        add(jlimage); jpimage.add(jlimage); add(jpimage);
        jpimage.setLocation(300,100);
        jlimage.setVisible(true);

        jltext.setText("원래 공룡 입에서 문구가 나오는 것을 " + "기획했지만 주제와 맞지 않아서 그만뒀음ㅜㅜ");
        add(jltext); jptext.add(jltext); add(jptext);
        jptext.setLocation(200,-150);
        jptext.setVisible(true);

        //back button
       JButton back = new JButton("돌아가기");
        jpback.add(back, BorderLayout.SOUTH);
        jpback.setSize(500,500);
        jpback.setVisible(true);
        add(jpback);
        //다시 돌아가는 코드 구현
        setVisible(true);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuBar1("fortune"); //MenuBar로 감
                setVisible(false);
            }
        });

    }
}
