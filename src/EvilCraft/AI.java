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

/**
 *
 * @author csc190
 */
public class AI {
    //-- data members 
    protected Team team;
    protected ButtonController btnController;
    
    //-- operations
    public AI(Team team, ButtonController btnController){
        this.team = team;
        this.btnController = btnController;
    }
    
    /**
     * Called by GameEngine.onTick() for every 150 ticks.
     * Make decision based on enemy info
     */
    public void update(){
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
}
