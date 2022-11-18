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

        //txt파일로 내가 뽑은 문구들 저장
        String text = lastwords.txt;
        String fileNm="C:\\Users\\USER\\Desktop\\myself\\1-3\\수행평가\\JAVA_testfile.txt";
        try{
            File lastword = new File(fileNm);
            FileWriter fileWriter = new FileWriter(file, true);

            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String args[]){


    }

}
