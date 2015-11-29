package pl.comarch.patterns.construct.factory

import pl.comarch.patterns.construct.factory.shape.Circle
import spock.lang.Specification

/**
 * Created by Asia on 2015-11-29.
 */
class CircleTest extends Specification {
    def "Draw"() {
        Circle cir = new Circle();
        expect:
        "draw circlle" == cir.draw()
    }
}
