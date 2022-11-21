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
        JPanel imagejp = new JPanel();
        JPanel btnp = new JPanel(new BorderLayout());
        JButton back = new JButton();
        TextArea lastwords = new TextArea();

        setLayout(new BorderLayout());
        JLabel jlimage = new JLabel();

        add(new Button("back"),BorderLayout.SOUTH);
        add(btnp);
        btnp.add(back);
        btnp.setSize(400,400);
        /*back.setSize(400,400);*/
        btnp.setLocation(300,100);
        btnp.setVisible(true);

   /*     lastwords.setBackground(Color.WHITE);
        jp.setBackground(Color.white); 왜 이 3개 다 안 됨?
        setBackground(Color.white);*/
        setSize(1000,700);
        setLocation(400,200);
        setVisible(true);

        //포춘공룡 이미지 추가
        jlimage= new JLabel(ImageUtil.getImageNumber(포춘공룡),SwingConstants.CENTER);
        add(jlimage); imagejp.add(jlimage); add(imagejp);
        /*imagejp.setLocation(450,25); //이미지 위치*/
        imagejp.setSize(800,800); //공룡크기
        imagejp.setVisible(true);
        jlimage.setVisible(true);


    }

    public static void main(String args[]){
        //txt파일로 내가 뽑은 문구들 저장
        String text = "nothing" ;
        String fileNm="C:\\Users\\USER\\Desktop\\myself\\1-3\\수행평가\\JAVA_Lastwords.txt";

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
