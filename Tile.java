

public class Tile {
    private char tileType;
    private int treasure;
    private char rotation;

    public Tile(char t, int p,char r){
        tileType = t;
        treasure = p;
        rotation = r;
    }
    public char getType(){
        return tileType;
    }
    public int getTreasure(){
        return treasure;
    }
    public int getRotation(){
        return rotation;
    }
    public void print(){
        System.out.println("Tile Type " + tileType + ", Treasuere " + treasure + ", rotation " + rotation);
    }
}
