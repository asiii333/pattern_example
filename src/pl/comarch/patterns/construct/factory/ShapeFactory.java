package pl.comarch.patterns.construct.factory;

import pl.comarch.patterns.construct.factory.color.Color;
import pl.comarch.patterns.construct.factory.color.ColorType;
import pl.comarch.patterns.construct.factory.shape.*;

/**
 * Created by Asia on 2015-11-29.
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(ColorType color) {
        return null;
    }

    public Shape getShape(ShapeType type){
        switch (type){
            case CIRCLE: return new Circle();
            case RECTANGLE: return new Rectnagle();
            case SQUARE: return new Square();
            default: return null;
        }
    }
}
