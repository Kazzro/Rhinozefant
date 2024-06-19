package main.solver;

import java.awt.*;
import java.awt.image.BufferedImage;

public class RhinozelfantChecker {

    public static BufferedImage solve(BufferedImage input,int blockSize){
        int matchSize = blockSize-1;
        int width = input.getWidth();
        int height = input.getHeight();

        BufferedImage newImage = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if(checkSimilarities(input, x, y,matchSize)){
                    newImage.setRGB(x,y, Color.WHITE.getRGB());
                }
                else{
                    newImage.setRGB(x,y,input.getRGB(x,y));
                }
            }
        }

        return newImage;

    }

    private static boolean checkSimilarities(BufferedImage image, int x, int y, int maxMatches){
        int pixelColor = image.getRGB(x, y);
        int matchCount = 0;

        // Überprüfe die Pixel in der Umgebung (nach oben, unten, links und rechts)
        if (x > 0 && image.getRGB(x - 1, y) == pixelColor) matchCount++;
        if (x < image.getWidth() - 1 && image.getRGB(x + 1, y) == pixelColor) matchCount++;
        if (y > 0 && image.getRGB(x, y - 1) == pixelColor) matchCount++;
        if (y < image.getHeight() - 1 && image.getRGB(x, y + 1) == pixelColor) matchCount++;

        // Wenn die meisten Nachbarpixel dieselbe Farbe haben, könnte es ein Rhinozelfant-Pixel sein
        return matchCount >= maxMatches;


    }
}
