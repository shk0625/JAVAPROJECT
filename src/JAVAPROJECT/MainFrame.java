package JAVAPROJECT;

import JAVAPROJECT.db.FindList;
import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;
import java.sql.ResultSet;

public class MainFrame {
    public static void main(String args[]){
        ImageUtil.setImage(); // 이미지 세팅

        FindList.get();

        JFrame jf = new JFrame();
        jf.setTitle("포춘쿠키");
        jf.setSize(1000,700);
        jf.setLocation(400,200);
        jf.setVisible(false);

        ImageUtil.setImage();

        new MenuBar1("fortune");
    }
}
