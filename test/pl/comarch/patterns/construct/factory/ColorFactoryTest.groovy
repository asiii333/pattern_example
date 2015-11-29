package pl.comarch.patterns.construct.factory

import pl.comarch.patterns.construct.factory.color.Blue

import static pl.comarch.patterns.construct.factory.color.ColorType.*;
import pl.comarch.patterns.construct.factory.color.Red
import spock.lang.Specification

/**
 * Created by Asia on 2015-11-29.
 */
class ColorFactoryTest extends Specification {
    def "getColor"(){

        given:
        ColorFactory factory = new ColorFactory()

        expect:
        factory.getColor(RED) instanceof Red
        factory.getColor(BLUE) instanceof Blue
        factory.getColor(GREEN) == null
    }
}
