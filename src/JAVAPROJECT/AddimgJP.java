package JAVAPROJECT;

import javax.swing.*;
import java.awt.*;

public class AddimgJP extends JFrame {
    JPanel jpb=new JPanel();
    JPanel jp1 = new JPanel(); //터지기 전 눈 뜸
    JPanel jp2 = new JPanel(); //터지기 전 눈 감음
    JPanel jp3= new JPanel(); //터짐

    JLabel lb = new JLabel(); //공룡
    JLabel lb1 = new JLabel(); //눈뜸안터짐
    JLabel lb2 = new JLabel(); //눈감음 안터짐
    JLabel lb3 = new JLabel(); //터짐

    JButton back = new JButton();

    ImageIcon img1= new ImageIcon("포춘쿠키안터지고눈뜸크기조정 ㅇ.png"); //jp1
    ImageIcon img2= new ImageIcon("포춘쿠키 안 터지고 눈감음 조정ㅇ.png"); //jp2
    ImageIcon img3= new ImageIcon("포춘쿠키터지고눈뜸크기조정 ㅇ.png"); //jp3
    ImageIcon img4= new ImageIcon("포춘공룡.png"); //jp


    public AddimgJP() {
      setTitle("포춘쿠키");
      setSize(1000,700);
      Dimension frameSize = getSize();
      Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();


        lb= new JLabel("공룡",img4,SwingConstants.CENTER);
        lb1 = new JLabel("first",img1,SwingConstants.CENTER);
        lb2 = new JLabel("sec",img2,SwingConstants.CENTER);
        lb3 = new JLabel("th",img3,SwingConstants.CENTER);


        setLocation((windowSize.width-frameSize.width)/2,(windowSize.height-frameSize.height)/2);
      setVisible(true);

      jpb.setBackground(Color.white);

      setLocation(400,200);
      setVisible(true);

    }

    public static void main(String[] args){
         new AddimgJP();
         /*new Image1();*/
    }
}
