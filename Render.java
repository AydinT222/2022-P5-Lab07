import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Render extends Applet {
    public void paint(Graphics g) {
        try {
            File chessImg = new File("C:\\Users\\15262\\IdeaProjects\\2022-P5-Lab07\\chess.png");
            if (chessImg.canRead()) {
                BufferedImage bufImg = ImageIO.read(chessImg);
                g.drawImage(bufImg, 0, 0, null);
            } else {
                System.out.println("cannot read file");
            }
            Board.render(g);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
