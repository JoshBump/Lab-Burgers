import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class labyDriver {
    public static void initializeBoard() {
        BoardInitializer MakeBoard = new BoardInitializer();
    }
    public static void connectorClass() throws IOException {
      char typ= 'l';
      char rot=0;
      int trs=0;
      Image image = ImageIO.read(new File("TestFrog.jpg"));
      Tile tile = new Tile(typ, rot, trs);
//        for(int i = 0; i < 52; i++){
//            tile.getTreasure();
//            if(tile.getTreasure() == 0){
//                tile.getType();
//                if(tile.getType() == 'i'){
//                    GraphicsLab tileS = new GraphicsLab(image.toString(), 'i');
//                } else if (tile.getType() == 't') {
//                    GraphicsLab tileS = new GraphicsLab(image.toString(), 't');
//                } else if (tile.getType() == 'l') {
//                    GraphicsLab tileS = new GraphicsLab(image.toString(), 'l');
//                }
//
//            }

        }
//      GraphicsLab tileS = new GraphicsLab(image.toString(), tile.type);
//      tile.updateTile();
//
//
//    }

    public static void main(String[] args) throws IOException {
        initializeBoard();
        String s = "";
        GraphicsLab graphics = new GraphicsLab(s);
        TileGrid board = new TileGrid();
        for(int i = 0; i < 49; i++){
            graphics.TileGraphics(i+1, graphics.AssignTile(board.getTreasure(i), board.getType(i)));
        }
        graphics.TileRepaint();
//
//
//
//
//
//        for(int i = 0; i < 52; i++){
//            board.getTile(i);
//
//        }

        //connectorClass();
        Image image = ImageIO.read(new File("TestFrog.jpg"));


        board.printTiles();
    }

}
