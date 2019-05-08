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
package FXDevices;

import BridgePattern.ICanvasDevice;
import BridgePattern.IGameEngine;
import BridgePattern.IStopWatch;
import java.io.File;

import java.io.InputStream;
import java.net.URL;
import java.util.Hashtable;
import java.util.Scanner;
import javafx.event.EventHandler;
import javafx.scene.CacheHint;
<<<<<<< HEAD
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
=======
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
>>>>>>> origin/NEW_MODULE_B
import javafx.scene.transform.Rotate;

/**
 * FXVersion Implementation of ICanvasDevice
 *
 * @author csc190
 */
public class FXCanvasDevice implements ICanvasDevice {

    //--------------------------------------
    //data members
    //--------------------------------------
    protected Canvas canvas;
    protected Hashtable<String, Image> map = new Hashtable();
    protected long nPixsDrawn = 0;
<<<<<<< HEAD
    protected int viewportX = 0, viewportY = 0;
=======
    protected int viewportX=0, viewportY = 0;
>>>>>>> origin/NEW_MODULE_B

    //--------------------------------------
    //methods
    //--------------------------------------
    protected Image getImage(String picpath) {
        if (!map.containsKey(picpath)) {
            //Somehow had to chop off the "resources part"
            String path2 = picpath.substring(picpath.indexOf("/") + 1);
            InputStream is = getClass().getClassLoader().getResourceAsStream(path2);

            Image img = new Image(is);
            map.put(picpath, img);
        }
        return map.get(picpath);
    }

    public FXCanvasDevice(Canvas canvas) {
        this.canvas = canvas;
<<<<<<< HEAD
        if (canvas != null) {
            canvas.setCache(false);
        }
=======
        canvas.setCache(false);
>>>>>>> origin/NEW_MODULE_B
        //canvas.setCacheHint(CacheHint.SPEED);

    }

    protected GraphicsContext mygc = null;

    @Override
    public void drawImg(String imgPath, int x, int y, int width, int height, int degree) {
        x -= this.viewportX;
        y -= this.viewportY;
        //1. SPEED IT UP. If not in view port, skip it
<<<<<<< HEAD
        if ((x <= -100 || x > this.getWidth() + 100 || y < -100 || y > this.getHeight() + 100)
                || (x + 100 < -1000 || x + 100 > this.getWidth() + 100 || y + 100 < -100 || y + 100 > this.getHeight() + 100)) {
=======
        if( (x<=-100 || x>this.getWidth()+100 || y<-100 || y>this.getHeight()+100) ||
                (x+100<-1000 || x+100>this.getWidth()+100 || y+100<-100 || y+100>this.getHeight()+100) )  {
>>>>>>> origin/NEW_MODULE_B
            return; //don't draw it
        }
        //1. calculate the actual pixels to be drawn in the view port (due to clipping)
        int minX = Integer.max(x, 0);
<<<<<<< HEAD
        int maxX = Integer.min(x + width, this.getWidth());
        int minY = Integer.max(y, 0);
        int maxY = Integer.min(y + height, this.getHeight());
        int xDiff = maxX - minX;
        int yDiff = maxY - minY;
        if (xDiff < 0 || yDiff < 0) {
            int bp = 1; //should exception
        }
        this.nPixsDrawn += xDiff * yDiff;

=======
        int maxX = Integer.min(x+width, this.getWidth());
        int minY = Integer.max(y, 0);
        int maxY = Integer.min(y+height, this.getHeight());
        int xDiff = maxX - minX;
        int yDiff = maxY - minY;
        if(xDiff<0 || yDiff<0) {
            int bp = 1; //should exception
        }
        this.nPixsDrawn += xDiff*yDiff;
        
        
>>>>>>> origin/NEW_MODULE_B
        //2. Real drawing
        Image img = getImage(imgPath);
        GraphicsContext gc = mygc != null ? mygc : this.canvas.getGraphicsContext2D();
        mygc = gc;

        if (degree > 0) {
            gc.save();
            Rotate r = new Rotate(degree, x + width / 2, y + height / 2);
            gc.setTransform(r.getMxx(), r.getMyx(), r.getMxy(), r.getMyy(), r.getTx(), r.getTy());
            gc.drawImage(img, x, y, width, height);
            gc.restore();
        } else {
            gc.drawImage(img, x, y, width, height);
        }

    }

    @Override
    public int getWidth() {
        return (int) this.canvas.getWidth();
    }

    @Override
    public int getHeight() {
        return (int) this.canvas.getHeight();
    }

    @Override
    public IStopWatch createStopWatch(String name) {
        FXStopWatch watch = new FXStopWatch(name);
        return watch;
    }

    protected int x1, x2, y1, y2;
    protected boolean bRightDown = false;

    @Override
    public void setupEventHandler(IGameEngine gameEngine) {
        ICanvasDevice me = this;
<<<<<<< HEAD

=======
        
>>>>>>> origin/NEW_MODULE_B
        //2. set up mouse drag event
        this.canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                x1 = (int) event.getX();
                y1 = (int) event.getY();
                bRightDown = event.isSecondaryButtonDown();
            }
        });
<<<<<<< HEAD
=======
        
        this.canvas.setOnMouseMoved(new EventHandler<MouseEvent>(){
             @Override
            public void handle(MouseEvent event) {

                x1 = (int) event.getX();
                y1 = (int) event.getY();
                if(!event.isPrimaryButtonDown()){
                    gameEngine.onMouseMoved(me, x1, y1);
                }
            }
        });
>>>>>>> origin/NEW_MODULE_B

        this.canvas.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                x2 = (int) event.getX();
                y2 = (int) event.getY();
                if (x1 != x2 || y1 != y2) {
                    gameEngine.onRegionSelected(me, x1, y1, x2, y2);
<<<<<<< HEAD
                } else {
                    if (bRightDown) {
                        gameEngine.onRightClick(me, x1, y1);
                    } else {
=======
                }else{
                    if(bRightDown){
                        gameEngine.onRightClick(me, x1, y1);
                    }else{
>>>>>>> origin/NEW_MODULE_B
                        gameEngine.onLeftClick(me, x1, y1);
                    }
                }
            }
        });
    }

    @Override
    public void clear() {
        this.canvas.getGraphicsContext2D().clearRect(0, 0, this.canvas.getWidth(), this.canvas.getHeight());
    }

    @Override
    public String readFile(String filepath) {
        int idx = filepath.indexOf("resources/");
<<<<<<< HEAD
        filepath = filepath.substring(idx + "resources/".length());

=======
        filepath = filepath.substring(idx+"resources/".length());
        
>>>>>>> origin/NEW_MODULE_B
        InputStream is = getClass().getClassLoader().getResourceAsStream(filepath);
        Scanner sc = new Scanner(is);
        String sContent = sc.useDelimiter("\\Z").next();
        return sContent;
    }

    @Override
    public long getTotalPixsDraw() {
        return this.nPixsDrawn;
    }

    @Override
    public void setViewPort(int x, int y) {
<<<<<<< HEAD
=======
        //TEST USE REMOVE LATER ---------
        if(y==1000){
            int bp = 1;
        }
        //TEST USE REMOVE LATER -----------
>>>>>>> origin/NEW_MODULE_B
        this.viewportX = x;
        this.viewportY = y;
    }

<<<<<<< HEAD
   @Override
    public void drawText(String msg, int x, int y, int fontsize) {
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        gc.setFont(new Font(fontsize));
        gc.strokeText(msg, x, y);
=======
    @Override
    public void drawText(String msg, int x, int y, int fontsize) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> origin/NEW_MODULE_B
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
<<<<<<< HEAD
         GraphicsContext gc = this.canvas.getGraphicsContext2D();
         gc.strokeLine(x1, y1, x2, y2);
    }


    
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void takeSnapshot(String imgname) {
        WritableImage img = new WritableImage(this.getWidth(), this.getHeight());
        this.canvas.snapshot(new SnapshotParameters(), img);
        this.map.put(imgname, img);
    }

    @Override
    public void drawRectangle(int x, int y, int w, int h, String color) {
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        
        Color cColor = Color.web(color);
        gc.setFill(cColor);
        gc.fillRect(x, y, w, h);
    }

    @Override
    public int getX() {
        return this.viewportX;
    }

    @Override
    public int getY() {
        return this.viewportY;
    }

>>>>>>> origin/NEW_MODULE_B
}
