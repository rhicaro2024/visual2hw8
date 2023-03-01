package edu.endicott.csc.shapefarmerv2;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ShapeSorter extends Shape{
    ArrayList<Shape> shapeList;
    
    public ShapeSorter(ArrayList<Shape> shapeArray){
        this.shapeList = shapeArray;
        compareShapes(shapeList);
    }
    
    @Override//Not Needed
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override//Not Needed
    public boolean wasClicked(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public static void main(String[] args){
        ArrayList<Shape> shapeList = new ArrayList<>();
        for (int i=0; i < 7; i++){
            int j = ThreadLocalRandom.current().nextInt(1,6);
            shapeList.add(new Circle(50 + (5 * j), 70 + (5 * j), 15));
            shapeList.add(new Rectangle(20 * (5 * j), 20 + (5 * j), 30, 20));
        }
        
        for (Shape shape: shapeList){
            System.out.println("X Value is: " + shape.x + "Y Value is: " + shape.y);
        }
        ShapeSorter sorter = new ShapeSorter(shapeList);
    }
}
