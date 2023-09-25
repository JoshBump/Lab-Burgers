public class TileGrid {
    private static int SIZE = 7;
    private Tile [] tileMap = new Tile[SIZE*SIZE];

    public TileGrid(){}

    public void CreateTile(int x, int y, char typ, char rot, int trs){
        tileMap[y*SIZE+x] = new Tile(typ,rot,trs);
        return;
    }

    public void CreateTile(int pos, char typ, char rot, int trs){
        tileMap[pos] = new Tile(typ,rot,trs);
        return;
    }

    public Tile SlideTileLeft(Tile tileIn, int row){
        Tile tileOut;
        tileOut = tileMap[row*SIZE];
        for(int i=0;i<SIZE-1;i++){
            tileMap [row*SIZE+i] = tileMap [row*SIZE+i+1];
        }
        tileMap [row*SIZE+SIZE-1] = tileIn;
        return tileOut;
    }

    public Tile SlideTileRight(Tile tileIn, int row){
        Tile tileOut;
        tileOut = tileMap[row*SIZE+SIZE-1];
        for(int i=SIZE-1;i>0;i--){
            tileMap [row*SIZE+i] = tileMap [row*SIZE+i-1];
        }
        tileMap [row*SIZE] = tileIn;
        return tileOut;
    }

    public Tile SlideTileUp(Tile tileIn, int col){
        Tile tileOut;
        tileOut = tileMap[col];
        for(int i=0;i<SIZE-1;i++){
            tileMap [col+SIZE*i] = tileMap [col+SIZE*(i+1)];
        }
        tileMap [col+SIZE*(SIZE-1)] = tileIn;
        return tileOut;
    }
//
    public Tile SlideTileDown(Tile tileIn, int col){
        Tile tileOut;
        tileOut = tileMap[col+SIZE*(SIZE-1)];
        for(int i=SIZE-1;i>0;i--){
            tileMap [col+SIZE*i] = tileMap [col+SIZE*(i-1)];
        }
        tileMap [col] = tileIn;
        return tileOut;
    }

    public void printTiles(){
        for(int y=0;y<SIZE;y++){
            for(int x=0;x<SIZE;x++){
                System.out.print(tileMap[x+SIZE*y].getTreasure() + ", ");
            }
            System.out.println();
        }
    }
}
