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
<<<<<<< HEAD
//merge conflict fixed by Akash
import BridgePattern.ICanvasDevice;
=======

import BridgePattern.ICanvasDevice;
import java.util.ArrayList;
>>>>>>> origin/NEW_MODULE_D

/**
 *
 * @author csc190
 */
<<<<<<< HEAD
public class Infantry extends Sprite{

    protected String pic;
    public Infantry(Team team, int x, int y, int w, int h) {
        super(team, x, y, w, h, 20, 0, 0);
        pic = this.team==GameEngine.getInstance().getPlayerTeam()?
                "resources/images/team_red/infantry/infantry.png":
                "resources/images/team_yellow/infantry/infantry.png";
    }

    @Override
    public void update() {
=======
public class Infantry extends ArmyUnit {

    protected String[] arrPics;

    public Infantry(Team team, int x, int y, int w, int h) {
        super(team, x, y, w, h, 20, 0, 0);
        String team_name = team == GameEngine.getInstance().getPlayerTeam() ? "team_red" : "team_yellow";

        this.arrPics = new String[]{
            "resources/images/" + team_name + "/soldier/soldier.png"

        };
    }

    int ticks = 0;

    @Override
    public void update() {
        super.update();
        ticks++;
        int idx = ticks / 10 % this.arrPics.length;
        this.pic = this.arrPics[idx];
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public void drawOnMainView(ICanvasDevice mainview) {
<<<<<<< HEAD

         mainview.drawImg(pic, this.getX() - this.getW() / 2, this.getY() - this.getH() / 2, this.getW(), this.getH(), 0);
=======
        if (this.pic != null) {
            mainview.drawImg(this.pic, this.getX(), this.getY(), this.getW(), this.getH(), 0);
        }

>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public void drawOnMiniMap(ICanvasDevice minimap) {
<<<<<<< HEAD
        int mw = GameEngine.getInstance().map.getNumRows()*100;
        int vw = minimap.getWidth();
        String color = this.team.name.indexOf("Human")>=0? "#FF0000": "#0000FF";
        minimap.drawRectangle(getX()*vw/mw, getY()*vw/mw, getW()*vw/mw, getH()*vw/mw, color);
    }    

    @Override
    public Point getNextMove() {
        return this.defaultGetNextMove(3);
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getNextMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public boolean isFacing(Point pt) {
<<<<<<< HEAD
       return true;
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> origin/NEW_MODULE_D
    }

    @Override
    public void adjustBodyHeading(Point pt) {
<<<<<<< HEAD
        //do nothing
    }
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetCoolRate() {
        this.setCoolTicksNeeded(15);
    }

    @Override
    public SpriteInfo getFiringGoal() {
     //1. get the enemy in range
        ArrayList<Sprite> ar = this.getEnemyInRange(50);
        for (int i = 0; i < ar.size(); i++) {
            SpriteInfo si = ar.get(i).getSpriteInfo();
            if (si == this.attackGoal) {
                return si;
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            SpriteInfo si = ar.get(i).getSpriteInfo();
            if (si.type == SpriteInfo.TYPE.PLANE) {
                return si;
            }
            if (si.type == SpriteInfo.TYPE.INFANTRY) {
                return si;
            }
            if (si.type == SpriteInfo.TYPE.TANK) {
                return si;
            }
            if (si.type == SpriteInfo.TYPE.BASE) {
                return si;
            }
        }

        return null;    
    }

    @Override
    public boolean isGunFacing(Point goal) {
        return true;
    }

    @Override
    public void adjustGunHeading(Point goal) {
        //do nothing
    }

    @Override
    public void fireAt(Point pt) {
         Bullet shell = new Bullet(this.team, this.getX()+this.getW()/2, this.getY() + this.getH()/2, 5, 5, 100000, 3, pt.x, pt.y);
        GameEngine ge = GameEngine.getInstance();
        ge.addSprite(shell);
    }

>>>>>>> origin/NEW_MODULE_D
}
