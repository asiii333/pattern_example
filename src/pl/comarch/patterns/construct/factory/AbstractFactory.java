package pl.comarch.patterns.construct.factory;

import pl.comarch.patterns.construct.factory.color.Color;
import pl.comarch.patterns.construct.factory.color.ColorType;
import pl.comarch.patterns.construct.factory.shape.Shape;
import pl.comarch.patterns.construct.factory.shape.ShapeType;

/**
 * Created by Asia on 2015-11-29.
 */
public abstract class AbstractFactory {
    abstract Color getColor(ColorType color);
    abstract Shape getShape(ShapeType shape) ;
}
