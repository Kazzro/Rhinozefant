package main.data;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    final static String path= "ressources/input/";
    public static BufferedImage loadImage(String filename) {

        File newFile = new File(path+filename);
        BufferedImage image = null;
        try{
            image = ImageIO.read(newFile);
        }
        catch(Exception e) {
            e.printStackTrace();
        };

        return image;


    }


}
