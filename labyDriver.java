import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class labyDriver {

    public static void main(String[] args) {

        String s = " ";

        GraphicsLab graphics = new GraphicsLab(s);
        TileGrid board = new TileGrid();
        graphics.IndicatorsAdd();


        //board.printTiles();
        for(int i = 0; i < 50; i++){
            graphics.TileGraphics(i+1, graphics.AssignTile(board.getTreasure(i), board.getType(i), board.getRotation(i)));
            graphics.TileRepaint();
        }
//        for(int f = 0; f < 50; f++){
//            BufferedImage image;
//            image = graphics.list.get(f);
//            graphics.rotateImage(image, board.getRotation(f));
//            graphics.TileRepaint();
//        }
        graphics.frame.setVisible(false);
        graphics.frame.setVisible(true);
        graphics.TileRepaint();





}}
