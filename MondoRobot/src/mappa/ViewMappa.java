package mappa;

public class ViewMappa {
    Tile[] tiles;
    int [][] mapTiles;



    public void getTileImage() {
            try {
                tiles[0] = new Tile();
                tiles[0].setImage(ImageIO.read(getClass().getResourceAsStream("/components/ground.png")));
                tiles[1] = new Tile();
                tiles[1].setImage(ImageIO.read(getClass().getResourceAsStream("/components/wall.png")));
                tiles[2] = new Tile();
                tiles[2].setImage(ImageIO.read(getClass().getResourceAsStream("/components/ceil.png")));
                tiles[3] = new Tile();
                tiles[3].setImage(ImageIO.read(getClass().getResourceAsStream("/components/water.png")));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
}
