package pl.comarch.patterns.structural.facade;

/**
 * Created by Asia on 2015-11-08.
 */

public class Rectangle implements Shape {
    Square squeare;
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
