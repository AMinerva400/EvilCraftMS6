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
 *
 * @author csc190
 */
public class Airplane extends Sprite {

    protected String pic = "resources/images/team_red/plane/plane.png";

    public Airplane(Team team, int x, int y, int w, int h) {
        super(team, x, y, w, h);
    }

    @Override
    public void update() {
    }

    @Override
    public void drawOnMainView(ICanvasDevice mainview) {
        mainview.drawImg(pic, x, y, w, h, 0);
    }

    @Override
    public void drawOnMiniMap(ICanvasDevice minimap) {
        int mw = GameEngine.getInstance().map.getNumRows() * 100;
        int vw = minimap.getWidth();
        String color = this.team.name.indexOf("Human") >= 0 ? "#FF0000" : "#0000FF";
        minimap.drawRectangle(x * vw / mw, y * vw / mw, w * vw / mw, h * vw / mw, color);
    }

}
