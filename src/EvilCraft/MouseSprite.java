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
import java.util.ArrayList;

/**
 * Represent the object of Mouse. Display mouse shapes at different situation
 * @author csc190
 */
public class MouseSprite extends Sprite{
    // --- DATA MEMBERS ---
    protected ICanvasDevice mainview;
    protected ICanvasDevice minimap;
    protected Map map;
    // --- DATA OPERATIONS ---

    /**
     * MouseSprite needs the dimension of mainview, minimap, and map to translate coordinates.
     * It also uses 
     * @param mainview
     * @param minimap
     * @param map 
     */
    public MouseSprite(ICanvasDevice mainview, ICanvasDevice minimap, Map map) {
        super(null, 0, 0, 0, 0, Integer.MAX_VALUE, 3, Integer.MAX_VALUE);
        this.mainview = mainview;
        this.minimap = minimap;
        this.map = map;
    }
    
    /***
     * Handle many cases:
     * (1) MouseMove (not close to boundary of canvas): when there are units selected: if arrSprites is empty or null, take the "Move" mode; otherwise "Attack Mode"
     * (2) MouseMove (close to canvas): take the "Arrow" mode. Arrow direction depending on location in canvas
     * (3) LeftClick: set the state to no units selected so that even Mouse Move, it will not show "Move" or "Attack" mode
     * @param eventType
     * @param canvas
     * @param x
     * @param y
     * @param arrSprites 
     */
    public void handleEvnet(MouseEvent eventType, ICanvasDevice canvas, int x, int y, ArrayList<Sprite> arrSprites){
         throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * Return first enemy sprite which is in the previous MouseMoved event
     * @return 
     */
    public Sprite getAttackGoal(){
        throw new UnsupportedOperationException("not implemented yet");
    }
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drawOnMainView(ICanvasDevice mainview) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drawOnMiniMap(ICanvasDevice minimap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
