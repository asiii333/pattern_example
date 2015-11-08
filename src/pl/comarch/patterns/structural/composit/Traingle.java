package pl.comarch.patterns.structural.composit;

/**
 * Created by Asia on 2015-11-07.
 */
public class Traingle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("Drawing Triangle in color "+color);
    }
}
