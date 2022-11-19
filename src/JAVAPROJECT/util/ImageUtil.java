package JAVAPROJECT.util;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static JAVAPROJECT.util.ImagePrint.*;
import static java.awt.Image.SCALE_SMOOTH;

public class ImageUtil {
    public static final String img1_URL = "C:\\Users\\USER\\Desktop\\back test 1\\JAVAPROJECT\\src\\JAVAPROJECT\\static\\image\\포춘쿠키_안_터지고_눈감음_조정.png";
    public static final String img2_URL = "C:\\Users\\USER\\Desktop\\back test 1\\JAVAPROJECT\\src\\JAVAPROJECT\\static\\image\\포춘쿠키안터지고눈뜸크기조정 ㅇ.png";
    public static final String img3_URL = "C:\\Users\\USER\\Desktop\\back test 1\\JAVAPROJECT\\src\\JAVAPROJECT\\static\\image\\포춘쿠키터지고눈뜸크기조정 ㅇ.png";
    public static final String img4_URL = "C:\\Users\\USER\\Desktop\\back test 1\\JAVAPROJECT\\src\\JAVAPROJECT\\static\\image\\포춘공룡.png";

    public static ImageIcon img1= new ImageIcon(img1_URL);
    public static ImageIcon img2= new ImageIcon(img2_URL);
    public static ImageIcon img3= new ImageIcon(img3_URL);
    public static ImageIcon img4= new ImageIcon(img4_URL);
    public static Map<ImagePrint, ImageIcon> imageMap = new HashMap<>();


    public static void setImage() {
        imageMap.put(안터지고눈감음, changeImage(img1));
        imageMap.put(안터지고눈뜸, changeImage(img2));
        imageMap.put(터지고눈뜸, changeImage(img3));
        imageMap.put(포춘공룡, changeImage(img4));
    }

    public static ImageIcon getImageNumber(ImagePrint str) {
        return imageMap.get(str);
    }

    public static ImageIcon changeImage(ImageIcon imageIcon) {
        Image image = imageIcon.getImage();
        Image changeImage = image.getScaledInstance(500, 400, SCALE_SMOOTH);
        return new ImageIcon(changeImage);
    }

}
