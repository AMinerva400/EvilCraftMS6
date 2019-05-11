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
import BridgePattern.IGameEngine;
import java.util.ArrayList;

/**
 * Represents the Palette of buttons for creating units
 * @author csc190
 */
public class ButtonController implements IGameEngine{
    //---- DATA MEMBERS ------------------
    protected ArrayList<ShopButton> arrButtons;
    protected Team myteam;
    protected ICanvasDevice canvas;
    //---- OPERATIONS --------------------

    /**
     * Create 3 buttons and set up the team and canvas for future use
     * @param team
     * @param canvas 
     */
    public ButtonController(Team team, ICanvasDevice canvas){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    @Override
    public void init() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * For each button, update() them and drawThem. Draw the text for remaining cash as well
     */
    @Override
    public void onTick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onRightClick(ICanvasDevice canvas, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onLeftClick(ICanvasDevice canvas, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onRegionSelected(ICanvasDevice canvas, int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onMouseMoved(ICanvasDevice canvas, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    /**
     * return true if there's money for it
     */
    public boolean spawnTank(){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
    /**
     * return true if there's money for it
     */
    public boolean spawnAircraft(){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
    /**
     * return true if there's money for it
     */
    public boolean spawnInfantry(){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
}
