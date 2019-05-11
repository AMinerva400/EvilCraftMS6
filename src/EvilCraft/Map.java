/*
 * Copyright (C) 2019 csc190
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package EvilCraft;

import BridgePattern.ICanvasDevice;

/**
 * Map will be later used to provide routing information
 * @author csc190
 */
public class Map {
    /**
     * constructor
     * @param mapPath
     * @param canvas - can be used to readFile()
     */
    public Map(String mapPath, ICanvasDevice canvas){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    public int getNumRows(){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    public int getNumCols(){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Get the maptile symbol at the location. Row and col are "logical" index of tiles.
     * @param row
     * @param col
     * @return 
     */
    public String getMapTile(int row, int col){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Given the symbol tell if it's an obstacle for ground units.
     * @param maptile
     * @return 
     */
    public boolean isObstacle(String maptile){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Generate the 2d cost matrix based on the map, for pt as destination.
     * @param pt
     * @return 
     */
    public int [][] generateBFSMap(Point pt){
        throw new UnsupportedOperationException("not implemented yet");
    }
}
