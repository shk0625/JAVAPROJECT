package JAVAPROJECT;

import JAVAPROJECT.db.DataContro;
import JAVAPROJECT.db.DatabaseCon;
import JAVAPROJECT.db.Datasave;
import JAVAPROJECT.db.FindList;
import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;

public class Main {
    public Main(){
        new DataContro();

    }

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
        new DatabaseCon();
        new FindList();
    }
}
