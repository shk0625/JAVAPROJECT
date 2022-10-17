package JAVAPROJECT;

import javax.swing.*;

public class MainLabel1 extends JFrame {
    public MainLabel1(JLabel charctor)throws InterruptedException{
        for(int i = 0; i<(Math.random()*2+2); i++){
            charctor.setIcon(new ImageIcon(getFrames().toString().getClass().getResource("안 터지고 눈 뜸")));
            Thread.sleep(1000);
            charctor.setIcon(new ImageIcon(getFrames().toString().getClass().getResource("안 터지고 눈 감음")));
            Thread.sleep(1000);
        }



    }
}
