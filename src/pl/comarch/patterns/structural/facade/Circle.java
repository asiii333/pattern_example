package pl.comarch.patterns.structural.facade;

/**
 * Created by Asia on 2015-11-08.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
