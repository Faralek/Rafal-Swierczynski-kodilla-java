package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }
    public Shape getFigure(int n){
        return shapes.get(n);
    }
    public boolean showFigures(){
        System.out.println(shapes);
        if(shapes!=null) {
            return true;
        }else{
            return false;
        }
    }
}
