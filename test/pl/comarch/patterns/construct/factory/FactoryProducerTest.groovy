package pl.comarch.patterns.construct.factory

import spock.lang.Specification

import static pl.comarch.patterns.construct.factory.FactoryType.*

/**
 * Created by Asia on 2015-11-29.
 */
class FactoryProducerTest extends Specification {

    FactoryProducer factory = new FactoryProducer();

    def "GetFactory test of get factory"() {
        given:

        expect:
        factory.getFactory(COLOR) instanceof ColorFactory
        factory.getFactory(SHAPE) instanceof ShapeFactory
        factory.getFactory(null) == null
    }
}
