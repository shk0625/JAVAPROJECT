package JAVAPROJECT;

import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static JAVAPROJECT.util.ImagePrint.터지고눈뜸;

public class AddimgJP extends JFrame {
    JPanel jpb=new JPanel();
    JPanel btnp = new JPanel(new BorderLayout());

    JPanel jp3= new JPanel(); //터짐

    JLabel lb3 = new JLabel(); //터짐

    public AddimgJP() {
      setTitle("포춘쿠키 출력");
      setSize(1000,700);
      jpb.setSize(500,300);


        lb3 = new JLabel("fortune",ImageUtil.getImageNumber(터지고눈뜸),SwingConstants.CENTER);


        add(lb3); jp3.add(lb3);
        add(jp3);
        setVisible(true);

      jp3.setBackground(Color.white); //이게 출력 됨

      setLocation(400,200);
      setVisible(true);

      //back button
        JButton back;
        back = new JButton("돌아가기");
        btnp.add(back,BorderLayout.SOUTH);
        btnp.setSize(500,500);
        btnp.setVisible(true);
        add(btnp);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuBar1("fortune"); //MenuBar로 돌아감
                setVisible(false);
            }
        });


    }

    public static void main(String[] args){
         new AddimgJP();
         new Button();
         /*new Image1();*/
    }
}
