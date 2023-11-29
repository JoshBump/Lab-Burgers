import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class labyDriver {
public static TileGrid board = new TileGrid();

public static Cards deck = new Cards();

public static Player red = new Player(1,deck);

    public static void main(String[] args) {

        GraphicsLab graphics = new GraphicsLab();
        for(int i = 0; i < 50; i++){
            graphics.TileGraphics(i+1, graphics.AssignTile(board.getTreasure(i), board.getType(i), board.getRotation(i)));

        }
        GraphicsLab.frame.repaint();


        Player blue = new Player(2,deck);
        Player yellow = new Player(3,deck);
        Player green = new Player(4,deck);

}}
