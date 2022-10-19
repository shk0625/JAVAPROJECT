package JAVAPROJECT;

import javax.swing.*;
import java.awt.*;

public class AddimgJP extends JPanel {
  public void paintComponent(Graphics g){

      Dimension d = getSize(); //size 받아내는 코드
      ImageIcon image1 = new ImageIcon("경로");
      g.drawImage(image1.getImage(),0,0,d.width,d.height,null);


    }
}
