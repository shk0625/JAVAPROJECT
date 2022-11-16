package JAVAPROJECT.db;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

//내가 뽑았던 문구들
public class LastWords extends JFrame {

    public LastWords() {
        JPanel jp = new JPanel();
        JButton back = new JButton();
        TextArea lastwords = new TextArea();

        back.add(back,BorderLayout.SOUTH);
        jp.add(back);
        back.setLocation(300,100);

   /*     lastwords.setBackground(Color.WHITE);
        jp.setBackground(Color.white); 왜 이 3개 다 안 됨?
        setBackground(Color.white);*/
        setSize(1000,700);
        setLocation(400,200);
        setVisible(true);

        //txt파일을 바탕화면에 저장
        File file = new File("C:\\Users\\USER\\Desktop\\myself\\1-3\\수행평가\\JAVA"); //LastWords로 된 파일 있음
        String getword = FindList.get();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

     /*   ArrayList<LastWords>
        for(int...getword){

        }*/

    }
    public static void main(String args[]){


    }

}
