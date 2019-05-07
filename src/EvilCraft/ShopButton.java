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
 * Represents a button for creating units
 * @author csc190
 */
public class ShopButton {
    //-------- DATA MEMBERS -------------
    public static final String TANK = "TANK";
    public static final String INFANTRY = "INFANTRY";
    public static final String PLANE = "PLANE";
    
    protected int x, y, w, h; //coordinates relative to ButtonController    
    protected String unitName; //of of defined constant TANK, INFANTRY, PLANCE
    protected int creationTime; //e.g., 500 ticks for tank etc
    protected int tickLeft = 0; //when it's not zero, the button is in progress
    protected String picPath; //the button figure to draw
    protected Team team; //which team it is serving
    
    //--------- OPERATIONS --------------
    public ShopButton(Team team, String unitName, int creationTime, String picPath, int x, int y, int w, int h){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * If it's in progress or Team has no money to pay, do not perform anything;
     * Otherwise call startTimer() to start the manufature process.
     */
    public void onClick(){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Simply set ticksLeft to creationTime
     */
    public void startTimer(){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Called at every tick. Update ticksLeft. If it's 1, it's time to
     * create the sprite and add to Team and GameEngine. Note: to call GameEngine
     * to find free spot.
     */
    public void update(){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Draw the button
     * @param canvas 
     */
    public void draw(ICanvasDevice canvas){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    
}
