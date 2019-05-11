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
import static java.lang.Integer.TYPE;
import java.util.Random;

/**
 * Base class of all game objects
 * @author csc190
 */
public abstract class Sprite {
    //------- DATA MEMBERS ----------
    private int x, y, w, h;
    private int altitude, blocking_score;
    protected Team team;
    protected boolean bDead = false;
    
    private int lifepoints;
    protected String id;
    protected String pic = null;
    
    //default explosion
    protected static String [] arrExplosion= new String [] {
        "resources/images/common/explosion/exp1.png",
         "resources/images/common/explosion/exp2.png",
          "resources/images/common/explosion/exp3.png",
           "resources/images/common/explosion/exp4.png",
            "resources/images/common/explosion/exp5.png",
    };
    
    
    //------- OPERATIONS -------------
    public int getLifepoints(){
        return this.lifepoints;
    }
    public void reduceLifepoints(int offset){
        lifepoints-=offset;
        if(lifepoints<0) lifepoints=0;
        if(lifepoints==0){
            this.startExplode();
        }
    }
    
    public void setDead(){
        this.bDead = true;
    }
    
    public boolean isDead(){
        return this.bDead;
    }
    
    final protected void setPos(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    
    
    
    public Sprite(Team team, int x, int y, int w, int h, int lifepoints, int altitude, int block_score){
        this.team = team;
        this.x = x;
        this.y = y;
        this.w= w;
        this.h = h;
        this.lifepoints = lifepoints;
        this.altitude = altitude;
        this.blocking_score = blocking_score;
        Random rand = new Random();
        this.id = String.valueOf(rand.nextInt())+"_" + String.valueOf(rand.nextInt());
    }
    
    public String getID(){
        return this.id;
    }
    
    public Team getTeam() {
        return this.team;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getW(){
        return this.w;
    }
    
    public int getH(){
        return this.h;
    }
    
    public int getAltitude(){
        return this.altitude;
    }
    
    public int getBlockingScore(){
        return this.blocking_score;
    }
    
    
    /**
     * update its own data attributes
     */
    public abstract void update();
    
    /**
     * Draw itself on main view, mostly like pictures
     * @param mainview - canvas device
     */
    public abstract void drawOnMainView(ICanvasDevice mainview);
    
    /**
     * Draw itself on mini map, most likely colored squares
     * @param minimap - canvas device
     */
    public abstract void drawOnMiniMap(ICanvasDevice minimap);
    
    /**
     * Get next move (for next tick), seek approval from game engine, and turn body if necessary.
     * NOTE this implementation only addresses  C3.2 BUT NOT C3.3
     * You got to check C3.3.2 Sequence diagram, which shows how to
     * decide next move based on navigation map.
     */
    final protected void setNextMove(){      
        Point pt = this.getNextMove(); //virtual function
        GameEngine ge = GameEngine.getInstance();
        if(ge.approveNextMove(this, pt, this.w, this.h)){
            this.setPos(pt.x, pt.y);
        }
    }
    
     /**
     * To be implemented by all sprites.
     * @return 
     */
    public abstract Point getNextMove();
    /**
     * if the body of the sprite is heading to pt
     * @param pt
     * @return 
     */
    public abstract boolean isFacing(Point pt);
    
    /**
     * Adjust the body heading so that it is pointing to pt.
     * Note that for Tank, multiple calls of adjustBodyHeading may be needed.
     * @param pt
     * @return 
     */
    public abstract void adjustBodyHeading(Point pt);
    
    public SpriteInfo getSpriteInfo(){
        SpriteInfo.TYPE type;
    
        if(this instanceof Base){
            type=SpriteInfo.TYPE.BASE;
        }else if(this instanceof Bullet){
            type=SpriteInfo.TYPE.BULLET;
        }else if(this instanceof Shell){
            type=SpriteInfo.TYPE.SHELL;
        }else if(this instanceof Bomb){
            type=SpriteInfo.TYPE.BOMB;
        }else if(this instanceof Tank){
            type=SpriteInfo.TYPE.TANK;
        }else if(this instanceof Infantry){
            type=SpriteInfo.TYPE.INFANTRY;
        }else if(this instanceof Airplane){
            type=SpriteInfo.TYPE.PLANE;
        }else{
            type=SpriteInfo.TYPE.BASE;
        }
            
        SpriteInfo si = new SpriteInfo(type, this.getX(), this.getY(), this.getLifepoints());
        return si;
        
    }
    
    protected int idx_explode=-1;
    protected void startExplode(){
        if(this.idx_explode<0){
             this.idx_explode = 0;
        }
    }
    protected int ticks = 0;
    protected void explode_ifenabled(){
        if(idx_explode==-1) return;
        ticks++;
        
        if(idx_explode==arrExplosion.length-1){
            this.setDead();
            return;
        }
        
        //updating the picture to show
        this.pic = arrExplosion[idx_explode];
        if(ticks%5==0){
            idx_explode = idx_explode<arrExplosion.length-1? idx_explode+1: idx_explode;
        }
    }
}
