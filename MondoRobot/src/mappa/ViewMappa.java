package mappa;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class ViewMappa {
    Tile[] tiles;
    int [][] mapTiles;

    public ViewMappa()


    public void getTileImage() {
            try {
                tiles[0] = new Tile();
                tiles[0].setImage(ImageIO.read(getClass().getResourceAsStream("/GuiComponents/ground.png")));
                tiles[1] = new Tile();
                tiles[1].setImage(ImageIO.read(getClass().getResourceAsStream("/GuiComponents/wall.png")));
                tiles[2] = new Tile();
                tiles[2].setImage(ImageIO.read(getClass().getResourceAsStream("/GuiComponents/ceil.png")));
                tiles[3] = new Tile();
                tiles[3].setImage(ImageIO.read(getClass().getResourceAsStream("/GuiComponents/water.png")));
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        public void draw(Graphics2D g) {
            int row = 0, col = 0, x = 0, y = 0;
            while( row < gh.getHEIGHT()) {
                int tNum = mapTiles[row][col];
                g.drawImage(tile[tNum].getImage(), x, y, gh.getTILESIZE(), gh.getTILESIZE(), null);
                col++;
                x += gh.getTILESIZE();
                if(col == gh.getWIDTH()) {
                    col = 0;
                    x = 0;
                    y += gh.getTILESIZE();
                    row++;
                }
            }
        }
}
