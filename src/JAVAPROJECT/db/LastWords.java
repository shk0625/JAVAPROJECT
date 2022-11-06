package JAVAPROJECT.db;

import javax.swing.*;
import java.io.*;

public class LastWords extends JFrame {
    JPanel jp = new JPanel();



    public static void main(String args[]){
        File file = new File("C:\\Users\\USER\\Desktop\\myself\\1-3\\수행평가\\JAVA");

        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);

        }catch (FileNotFoundException e){
            e.printStackTrace();

        }


    }

}
