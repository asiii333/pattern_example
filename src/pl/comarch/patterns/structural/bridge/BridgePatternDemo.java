package pl.comarch.patterns.structural.bridge;

/**
 * Created by Asia on 2015-11-07.
 */

/**
 * the Shape and DrawAPI classes to draw different colored circles.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
