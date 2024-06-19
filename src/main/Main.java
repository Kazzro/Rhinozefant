package main;

import java.awt.image.BufferedImage;
import main.data.ImageLoader;
import main.data.ImageWriter;
import main.solver.RhinozelfantChecker;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            BufferedImage image = ImageLoader.loadImage("rhinozelfant"+ i +".png");
            BufferedImage out = RhinozelfantChecker.solve(image,2);
            ImageWriter.saveImage("rhinozefantOut.png", out);
        }

    }
}
