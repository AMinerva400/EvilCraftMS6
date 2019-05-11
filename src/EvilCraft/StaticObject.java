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
 * Represents a maptile
 * @author csc190
 */
public class StaticObject extends Sprite{
<<<<<<< HEAD
    protected String picname;
    protected String maptileName;

    
    public StaticObject(Team team, int x, int y, int w, int h, String maptileName, int lifepoints) {
        super(team, x, y, w, h, lifepoints, 0, 0);
        this.maptileName = maptileName;
        this.picname = "resources/images/common/" + maptileName + ".png";
=======
    protected String pic;

    /***
     * Using maptile e.g., "tree", can be used to build the picture path
     * @param team
     * @param x
     * @param y
     * @param w
     * @param h
     * @param maptile 
     */
    public StaticObject(Team team, int x, int y, int w, int h, String maptile, int lifepoints) {
        super(team, x, y, w, h, lifepoints, 0, 0);
        pic = "resources/images/common/" + maptile + ".png";
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public void update() {
<<<<<<< HEAD
=======
        this.explode_ifenabled();
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public void drawOnMainView(ICanvasDevice mainview) {
<<<<<<< HEAD
        mainview.drawImg(picname, this.getX(), this.getY(), this.getW(), this.getH(), 0);
=======
        mainview.drawImg(this.pic,this.getX(), this.getY(), this.getW(), this.getH(), 0);
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public void drawOnMiniMap(ICanvasDevice minimap) {
<<<<<<< HEAD
        int mw = GameEngine.getInstance().map.getNumRows()*100;
        int vw = 200;
        minimap.drawImg(picname, getX()*200/mw, getY()*200/mw, getW()*200/mw+1, getH()*200/mw+1, 0);
=======
        //
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public Point getNextMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFacing(Point pt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adjustBodyHeading(Point pt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
<<<<<<< HEAD
=======
    
>>>>>>> origin/NEW_MODULE_D
}
