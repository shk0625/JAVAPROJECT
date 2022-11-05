package JAVAPROJECT.util;

import javax.swing.*;
import java.awt.*;

import static java.awt.Image.SCALE_SMOOTH;

public class ProjectUtil {

    public static ImageIcon changeImage(ImageIcon imageIcon) {
        Image image = imageIcon.getImage();
        Image changeImage = image.getScaledInstance(300, 300, SCALE_SMOOTH);
        return new ImageIcon(changeImage);
    }

}
