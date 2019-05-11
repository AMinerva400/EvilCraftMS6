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
//Conflicts solved by Akash

import BridgePattern.ICanvasDevice;
import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class Airplane extends Sprite{
    protected int degree;
    protected String picpath;

    public Airplane(Team team, int x, int y, int w, int h) {
        super(team, x, y, w, h, 40, 1, 1);
        if(team==GameEngine.getInstance().getAITeam()){
            picpath = "resources/images/team_yellow/plane/plane.png";
        }else{
             picpath = "resources/images/team_red/plane/plane.png";
        }
public class Airplane extends ArmyUnit {

    public Airplane(Team team, int x, int y, int w, int h) {
        super(team, x, y, w, h, 40, 1, 1);
        String team_name = team == GameEngine.getInstance().getPlayerTeam() ? "team_red" : "team_yellow";

        this.pic = "resources/images/" + team_name + "/plane/plane.png";
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void drawOnMainView(ICanvasDevice mainview) {
        if (this.pic != null) {
            mainview.drawImg(this.pic, this.getX(), this.getY(), this.getW(), this.getH(), 0);
        }
    }

    @Override
    public void drawOnMiniMap(ICanvasDevice minimap) {
        int mw = GameEngine.getInstance().map.getNumRows() * 100;
        int vw = minimap.getWidth();
        String color = this.team.name.indexOf("Human") >= 0 ? "#FF0000" : "#0000FF";
        minimap.drawRectangle(getX() * vw / mw, getY() * vw / mw, getW() * vw / mw, getH() * vw / mw, color);
    }

    @Override
    public Point getNextMove() {
        
        if(this.navigationGoal!=null){
            int x = this.getX()<navigationGoal.x? this.getX()+2: this.getX()-2;
            int y = this.getY()<navigationGoal.y? this.getY()+2: this.getY()-2;
            return new Point(x,y);
        }else{
            return new Point(this.getX(), this.getY());
        }
=======
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
        
        
    }
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetCoolRate() {
        this.setCoolTicksNeeded(6000);
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
        return;
    }

    @Override
    public void fireAt(Point pt) {
        Bomb shell = new Bomb(this.team, this.getX() + this.getW() / 2, this.getY() + this.getH() / 2, 10, 10, 10000, 2, 100000, pt.x, pt.y);
        GameEngine ge = GameEngine.getInstance();
        ge.addSprite(shell);
    }

>>>>>>> origin/NEW_MODULE_D
}
