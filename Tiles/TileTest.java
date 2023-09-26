public class TileTest {
    public static void main(String [] args){
        TileGrid board;
        boolean BoardInitNotDone = true;
        if(BoardInitNotDone){
            board = new TileGrid();
            for(int i=0;i<50;i++){
                board.CreateTile(i,'i','u',i);
            }
        }
        else{
            board = BoardInitializer.MakeBoard();
        }
        board.printTiles();
        board.SlideTileUp(0);
        board.SlideTileLeft(6);
        board.SlideTileDown(6);
        board.SlideTileRight(0);
        board.printTiles();
    }
}
