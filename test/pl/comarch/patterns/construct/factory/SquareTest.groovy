package pl.comarch.patterns.construct.factory

import pl.comarch.patterns.construct.factory.shape.Square
import spock.lang.Specification

/**
 * Created by Asia on 2015-11-29.
 */
class SquareTest extends Specification {
    def "Draw"() {
        expect:
        "draw square" == new Square().draw()
    }
}
