import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.awt.Color;
import java.awt.Font;

import javax.imageio.ImageIO;

public class StickerMaker {

    public void buildSticker(InputStream inputStream, String fileName) throws Exception {
        // read image
        BufferedImage originalImage = ImageIO.read(inputStream);

        // create a new image with transparency and a new Heigth
        int width = originalImage.getWidth();
        int altura = originalImage.getHeight();
        int newHeigth = altura + 200;
        BufferedImage newImage = new BufferedImage(width, newHeigth, BufferedImage.TRANSLUCENT);

        // copy original image to a new image (in memory)
        Graphics2D graphics = (Graphics2D) newImage.getGraphics();
        graphics.drawImage(originalImage, 0, 0, null);

        // FONT CONFIG
        var fontConfig = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.MAGENTA);
        graphics.setFont(fontConfig);

        // write a phase in new image
        graphics.drawString("GOOD FATHER", 0, newHeigth - 100);
        
        // write a new image in a file
        ImageIO.write(newImage, "png", new File(fileName));
    }


}