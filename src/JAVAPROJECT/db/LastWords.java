package JAVAPROJECT.db;

import JAVAPROJECT.MenuBar1;
import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import static JAVAPROJECT.util.ImagePrint.포춘공룡;

//내가 뽑았던 문구들
public class LastWords extends JFrame {

    public LastWords() {
        JPanel jp = new JPanel();
        /*JPanel imagejp = new JPanel();*/
        JPanel btnp = new JPanel(new BorderLayout());
        JLabel talklb= new JLabel();

        setLayout(new BorderLayout());
        JLabel jlimage = new JLabel();

        talklb.setText("바탕화면 봐볼래?");
        talklb.setLocation(300,300);
        talklb.setSize(400,400);
        /*talklb.setLocation(300,300);*/
        btnp.add(talklb);
        btnp.setLocation(300,300);
        /*btnp.setVisible(true);*/


        JButton back;
        back = new JButton("돌아가기");
        btnp.add(back,BorderLayout.SOUTH);
        btnp.setVisible(true);
        add(btnp); //기능 ㅇㅋ
        back.setVisible(true);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new MenuBar1("fortune");
                    setVisible(false);
            }
        });

        setSize(1000,700);
        setLocation(400,200);
        setVisible(true);

        //포춘공룡 이미지 추가
        jlimage= new JLabel(ImageUtil.getImageNumber(포춘공룡),SwingConstants.CENTER);
        add(jlimage); btnp.add(jlimage); add(btnp);
        btnp.setSize(800,800); //공룡크기
        /*btnp.setVisible(true);*/
        jlimage.setVisible(true);


        //창
        setTitle("지난 날의 문구들...");
        //같은 패널에 그냥 다 냅다 붙임
        btnp.setVisible(true);

    }

    public static void main(String args[]){


    }

}
