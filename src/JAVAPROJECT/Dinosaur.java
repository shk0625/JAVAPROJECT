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
        JPanel jpback=new JPanel();
        JLabel jlimage = new JLabel();


        setSize(1000,700);
        setLocation(400,200);
        jpimage.setSize(800,800);
//        jpimage.setLocation(400,200);

        jlimage= new JLabel("포춘공룡", ImageUtil.getImageNumber(포춘공룡),SwingConstants.CENTER);
        add(jlimage); jpimage.add(jlimage); add(jpimage);
        setVisible(true);



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
