package main.data;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageWriter {
    final static String directory = "ressources/output/";
    public static void saveImage(String filename, BufferedImage image){

        File output = new File(directory + filename);
        try {
            ImageIO.write(image, "png", output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
