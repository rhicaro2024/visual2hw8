package edu.endicott.csc.shapefarmerv2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Models a rectangle shape.
 * 
 * @author hfeild
 */
public abstract class Shape implements Drawable, Selectable, Wanderable, Comparable {
    protected int x, y;  // Upper left corner.
    protected boolean isSelected;    
    /**
     * @return Whether the shape is selected.
     */
    @Override
    public boolean isSelected(){
        return isSelected;
    }
    
    /**
     * Selects the shape. This will cause it to be highlighted when drawn next.
     */
    @Override
    public void select(){
        isSelected = true;
    }
    
    /**
     * Deselects the shape.
     */
    @Override
    public void deselect(){
        isSelected = false;
    }
    
    /**
     * Moves the shape in a random direction.
     */
    @Override
    public void wander(int minX, int maxX, int minY, int maxY){
        
        x =  Math.max(Math.min(x + (int) (Math.random()*50-25), maxX), minX);
        y =  Math.max(Math.min(y + (int) (Math.random()*50-25), maxY), minY);
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
