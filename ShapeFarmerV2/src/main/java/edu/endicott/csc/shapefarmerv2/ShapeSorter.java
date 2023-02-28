package edu.endicott.csc.shapefarmerv2;

import java.awt.Graphics;
import java.util.ArrayList;

public class ShapeSorter extends Shape{
    ArrayList<Shape> shapeList;
    
    public ShapeSorter(ArrayList<Shape> shapeArray){
        this.shapeList = shapeList;
    }
    
    @Override//Not Needed
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override//Not Needed
    public boolean wasClicked(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args){
        ArrayList<Shape> shapeList = new ArrayList<>();
        
    }
}
