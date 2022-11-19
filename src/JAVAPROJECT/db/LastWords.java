package JAVAPROJECT.db;

import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

import static JAVAPROJECT.util.ImagePrint.포춘공룡;

//내가 뽑았던 문구들
public class LastWords extends JFrame {

    public LastWords() {
        JPanel jp = new JPanel();
        JButton back = new JButton();
        TextArea lastwords = new TextArea();

        JLabel jlimage = new JLabel();

        back.add(back,BorderLayout.SOUTH);
        jp.add(back);
        back.setLocation(300,100);

   /*     lastwords.setBackground(Color.WHITE);
        jp.setBackground(Color.white); 왜 이 3개 다 안 됨?
        setBackground(Color.white);*/
        setSize(1000,700);
        setLocation(400,200);
        setVisible(true);

        //포춘공룡 이미지 추가
        jlimage= new JLabel(ImageUtil.getImageNumber(포춘공룡),SwingConstants.CENTER);
        add(jlimage); jp.add(jlimage); add(jp);
        jp.setLocation(450,25); //이미지 위치
        jp.setSize(800,800); //공룡크기
        jlimage.setVisible(true);


    }
    public static void main(String args[]){
        //txt파일로 내가 뽑은 문구들 저장
        String text = "여기에 데이터베이스 연동하면 됨 파ㅣ팅";
        String fileNm="C:\\\\Users\\\\USER\\\\Desktop.\\\\myself\\\\1-3\\\\수행평가\\\\JAVA_Lastwords.txt";
        try{
            File file = new File(fileNm);
            FileWriter fileWriter = new FileWriter(file, true);

            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
