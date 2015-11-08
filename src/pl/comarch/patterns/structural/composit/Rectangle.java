package pl.comarch.patterns.structural.composit;

/**
 * Created by Asia on 2015-11-07.
 */
public class Rectangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("Drawing Rectangle in color "+color);
    }
}
