package pl.comarch.patterns.construct.factory

import pl.comarch.patterns.construct.factory.shape.Rectnagle
import spock.lang.Specification

/**
 * Created by Asia on 2015-11-29.
 */
class RectnagleTest extends Specification {
    def "Draw"() {
        Rectnagle rec = new Rectnagle()
        expect:
        "draw rectangle" == rec.draw()
    }
}
