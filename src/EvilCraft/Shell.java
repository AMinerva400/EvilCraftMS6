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
 * Shells are fired by tanks
 * @author csc190
 */
<<<<<<< HEAD
public class Shell extends Sprite{
    //with altitude and block score
    public Shell(Team team, int x, int y, int w, int h, int lifepoints) {
        super(team, x, y, w, h, lifepoints, 0, 0);
=======
public class Shell extends Projectile{

   
    public Shell(Team team, int x, int y, int w, int h, int lifepoints, int destx, int desty) {
        super(team, x, y, w, h, lifepoints, 1000, 0, destx, desty);
        this.setTravel(15);
         this.pic = "resources/images/common/shell.png";
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public void update() {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
        super.update();
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public void drawOnMainView(ICanvasDevice mainview) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
        super.drawOnMainView(mainview);
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public void drawOnMiniMap(ICanvasDevice minimap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
<<<<<<< HEAD
=======

>>>>>>> origin/NEW_MODULE_D
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
    
}
