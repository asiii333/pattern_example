package pl.comarch.patterns.structural.flyweight;

import java.awt.*;

/**
 * Created by Asia on 2015-11-07.
 */
public interface Shape {

        public void draw(Graphics g, int x, int y, int width, int height, Color color);
}
