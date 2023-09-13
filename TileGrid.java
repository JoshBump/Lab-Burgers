

public class TileGrid {
    private int SizeMax = 6;
    private Tile [] tileMap = new Tile[SizeMax];

    public TileGrid(){
        
    }

    public int getSize(){
        return SizeMax;
    }

    public void newTile(char typ, int trs,char rot, int x){
        tileMap[x] = new Tile(typ,trs,rot);
        return;
    }

    public void insertTile(Tile t, int x){
        tileMap[x] = t;
        return;
    }

    public void swapTile(int a, int b){
        Tile hold;
        hold = tileMap[b];
        tileMap[b] = tileMap[a];
        tileMap[a] = hold;
        return;
    }

    public void printAt(int a){
        tileMap[a].print();
        return;
    }

    public void printAll(){
        for(int i=0;i<tileMap.length;i++){
            tileMap[i].print();
            System.out.println("Tile at position " + i);
        }
        return;
    }

}
