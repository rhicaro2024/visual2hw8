package edu.endicott.csc.shapefarmerv2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Models a rectangle shape.
 * 
 * @author hfeild
 */
public abstract class Shape implements Drawable, Selectable, Wanderable, Comparable<Shape>{
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
 
    @Override
    public int compareTo(Shape o) {
        if (x > o.x) {
            return 1;
        } else if (x < o.x) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public ArrayList<Shape> compareShapes(ArrayList<Shape> shapeArray){
        for (int i = 0; i < (shapeArray.size()); i++){
            for (int j = i+1; j < (shapeArray.size()); j++){
                Shape tmp = null;
                if (shapeArray.get(i).x > shapeArray.get(j).x);
                    tmp = shapeArray.get(i);
                    shapeArray.set(i, shapeArray.get(j));
                    shapeArray.set(j, tmp);
            }
        }
        for (Shape shape: shapeArray){
            System.out.println("x: " + shape.x + " y: " + shape.y);
        }
        return shapeArray;
    }
}

