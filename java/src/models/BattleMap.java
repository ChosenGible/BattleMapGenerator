package models;



public class BattleMap {
    private int height;
    private int width;
    private TerrainTypes[][] map;

    /**
     * Constructor: Sets up the dimensions of the map according to a width and height given by user
     *
     * */
    public BattleMap(int height, int width){
        this.height = height;
        this.width = width;

        map = new TerrainTypes[height][width];
    }
}
