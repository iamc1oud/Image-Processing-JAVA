package com.company;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ReadWrite {

    /*
    This code will read an image from specified location and
    copies it to another File object and write the previously
    BufferedImage object.
     */
    public static void readwrite(String[] args) {
        int width = 193;
        int height = 200;

        BufferedImage image = null;

        try {
            File input_file = new File("C:\\Users\\cloudmax.tech\\Pictures\\35bffa2e59bd2d2fb747048acc7bb6de.jpg");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(input_file);
            System.out.println(input_file);
        }
        catch (IOException e){
            System.out.println(e);
        }

        try {
            File output_file = new File("C:\\Users\\cloudmax.tech\\Pictures\\35bffa2e59bd2d2fb747048acc7bb62de.jpg");
            ImageIO.write(image, "jpg", output_file);
            System.out.println("Writing complete");
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
