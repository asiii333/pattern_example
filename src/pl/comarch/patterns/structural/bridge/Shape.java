package pl.comarch.patterns.structural.bridge;

/**
 * Created by Asia on 2015-11-07.
 */

/**
 * abstract class Shape using the DrawAPI interface.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
