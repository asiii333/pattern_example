package pl.comarch.patterns.construct.factory

import pl.comarch.patterns.construct.factory.shape.Circle
import pl.comarch.patterns.construct.factory.shape.Rectnagle
import pl.comarch.patterns.construct.factory.shape.Square

import static pl.comarch.patterns.construct.factory.shape.ShapeType.*;
import spock.lang.Specification

/**
 * Created by Asia on 2015-11-29.
 */
class ShapeFactoryTest extends Specification {

    def "GetShape"() {

        given:
        ShapeFactory factory = new ShapeFactory()

        expect:
        factory.getShape(CIRCLE) instanceof Circle
        factory.getShape(SQUARE) instanceof Square
        factory.getShape(RECTANGLE) instanceof Rectnagle
        factory.getShape(TRIANGLE) == null
    }
}
