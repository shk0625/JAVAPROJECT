package JAVAPROJECT;

import javax.swing.*;
import java.awt.*;

public class AddimgJP extends JFrame {
    JPanel jp = new JPanel();
    JButton btn = new JButton();

    ImageIcon imagenotboomopeneyes = new ImageIcon("포춘쿠키안터지고눈뜸크기조정 ㅇ.png");
    ImageIcon imagenotboomcloseeyes = new ImageIcon("포춘쿠키 안 터지고 눈감음 조정ㅇ.png");
    ImageIcon imageboomopeneyes = new ImageIcon("포춘쿠키터지고눈뜸크기조정 ㅇ.png");

    public AddimgJP() {
      setTitle("이미지 넣기");
      setSize(1000,700);
      Dimension frameSize = getSize();
      Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();

      setLocation((windowSize.width-frameSize.width)/2,(windowSize.height-frameSize.height)/2);
      setVisible(true);

      jp.setBackground(Color.white);
      btn.setRolloverIcon(imagenotboomcloseeyes);
      btn.setPreferredSize(new Dimension(300,150));

      jp.add(btn);
      add(jp);
      setVisible(true);

    }

    public static void main(String[] args) {
         new AddimgJP();
         /*new Image1();*/
    }
}
