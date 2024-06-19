package main;

import java.awt.image.BufferedImage;
import main.data.ImageLoader;
import main.data.ImageWriter;
import main.solver.RhinozelfantChecker;

public class Main {

    public static void main(String[] args) {
        BufferedImage image = ImageLoader.loadImage("rhinozelfant1.png");

        BufferedImage out = RhinozelfantChecker.solve(image,2);

        ImageWriter.saveImage("rhinozefantOut.png", out);

    }
}
