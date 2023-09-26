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

    public void SlideTileLeft(int row){
        Tile hold;
        hold = tileMap[49];
        tileMap[49] = tileMap[row*SIZE];
        for(int i=0;i<SIZE-1;i++){
            tileMap [row*SIZE+i] = tileMap [row*SIZE+i+1];
        }
        tileMap [row*SIZE+SIZE-1] = hold;
        return;
    }

    public void SlideTileRight(int row){
        Tile hold;
        hold = tileMap[49];
        tileMap[49] = tileMap[row*SIZE+SIZE-1];
        for(int i=SIZE-1;i>0;i--){
            tileMap [row*SIZE+i] = tileMap [row*SIZE+i-1];
        }
        tileMap [row*SIZE] = hold;
        return;
    }

    public void SlideTileUp(int col){
        Tile hold;
        hold = tileMap[49];
        tileMap[49] = tileMap[col];
        for(int i=0;i<SIZE-1;i++){
            tileMap [col+SIZE*i] = tileMap [col+SIZE*(i+1)];
        }
        tileMap [col+SIZE*(SIZE-1)] = hold;
        return;
    }

    public void SlideTileDown( int col){
        Tile hold = tileMap[49];
        tileMap[49] = tileMap[col+SIZE*(SIZE-1)];
        for(int i=SIZE-1;i>0;i--){
            tileMap [col+SIZE*i] = tileMap [col+SIZE*(i-1)];
        }
        tileMap [col] = hold;
        return;
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
