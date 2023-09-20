public class TileTest {
    public static void main(String [] args){
        TileGrid board = new TileGrid();
        Tile hold = new Tile('i','u',49);
        for(int i=0;i<49;i++){
            board.CreateTile(i,'i','u',i);
        }
        board.printTiles();
        board.SlideTileUp(hold,0);
        board.printTiles();
    }
}
