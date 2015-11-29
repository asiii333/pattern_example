package pl.comarch.patterns.construct.factory;

import static pl.comarch.patterns.construct.factory.FactoryType.*;

/**
 * Created by Asia on 2015-11-29.
 */
public class FactoryProducer {
    public AbstractFactory getFactory (FactoryType type){
        if(SHAPE.equals(type)){
            return new ShapeFactory();
        }
        if(COLOR.equals(type)){
            return new ColorFactory();
        }
        return null;
    }
}
