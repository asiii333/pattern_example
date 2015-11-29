package pl.comarch.patterns.construct.factory;

import pl.comarch.patterns.construct.factory.color.Blue;
import pl.comarch.patterns.construct.factory.color.Color;
import pl.comarch.patterns.construct.factory.color.ColorType;
import pl.comarch.patterns.construct.factory.color.Red;
import pl.comarch.patterns.construct.factory.shape.Shape;
import pl.comarch.patterns.construct.factory.shape.ShapeType;

/**
 * Created by Asia on 2015-11-29.
 */
public class ColorFactory extends AbstractFactory{
    public Color getColor(ColorType type){
        switch(type){
            case RED: return new Red();
            case BLUE: return new Blue();
            default: return null;
        }
    }

    @Override
    Shape getShape(ShapeType shape) {
        return null;
    }
}
