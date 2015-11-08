package pl.comarch.patterns.structural.composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asia on 2015-11-07.
 */
public class Drawing implements Shape{

    //collection of Shapes
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String color) {
        for(Shape sh : shapes)
        {
            sh.draw(color);
        }
    }
    //adding shape to drawing
    public void add(Shape s){
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s){
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
