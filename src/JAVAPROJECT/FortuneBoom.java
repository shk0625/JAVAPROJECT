package JAVAPROJECT;

import JAVAPROJECT.db.FindList;
import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import static JAVAPROJECT.util.ImagePrint.터지고눈뜸;

public class FortuneBoom extends JFrame {
    JPanel jpb=new JPanel();
    JPanel btnp = new JPanel(new BorderLayout());

    JPanel jp3= new JPanel(); //터짐

    JLabel lb3 = new JLabel(); //터짐
    JLabel lbwords = new JLabel();

    public FortuneBoom() {
      setTitle("포춘쿠키 출력");
      setSize(1000,700);
      jpb.setSize(500,300);
        lb3 = new JLabel(ImageUtil.getImageNumber(터지고눈뜸),SwingConstants.CENTER);
        add(lb3); jp3.add(lb3); add(jp3);
        jp3.setLocation(400,200);
        lb3.setVisible(true);


        jp3.setBackground(Color.white); //이게 출력 됨

      setLocation(400,200);
      setVisible(true);

      // txt 저장
      String word = FindList.get();

        try {
            BufferedWriter output = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C:\\Users\\USER\\Desktop\\back test 1\\JAVAPROJECT\\src\\JAVAPROJECT\\static\\txt\\lastwords.txt", true),
                            "UTF8")); //덮어쓰기말고 이어쓰기
            output.append(word + "\n");
            output.close();
        } catch (Exception e) {
            System.out.println("e = " + e);
        }

        //포춘쿠키 말 출력
        JTextField words = new JTextField(word);
        add(lbwords); jpb.add(words); add(jpb);
        jpb.add(lbwords);
        jpb.setLocation(285,400); //텍스트 필드 위치 조정되는 코드 (285,400)
        jpb.setBackground(Color.white); //깔끔하긴한데... 텍스트 필드 크기 자체를 키우고싶음.
        lbwords.setSize(300,300);
        jpb.setSize(400,100);

        add(lb3); jp3.add(lb3);
        add(jp3);
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
         new FortuneBoom();
         new Button();
    }
}
