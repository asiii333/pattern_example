package pl.comarch.patterns.structural.bridge;

/**
 * Created by Asia on 2015-11-07.
 */

/**
 * concrete bridge implementer classes implementing the DrawAPI interface.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
