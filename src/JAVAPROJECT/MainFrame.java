package JAVAPROJECT;

import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;

public class MainFrame {
    public static void main(String args[]){
        ImageUtil.setImage(); // 이미지 세팅

        JFrame jf = new JFrame();
        jf.setTitle("포춘쿠키");
        jf.setSize(1000,700);
        jf.setLocation(400,200);
        jf.setVisible(false);

        new MenuBar1("fortune");
    }
}
