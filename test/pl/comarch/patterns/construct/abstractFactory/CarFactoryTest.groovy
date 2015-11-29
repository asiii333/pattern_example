package pl.comarch.patterns.construct.abstractFactory

import spock.lang.Specification
import sun.reflect.generics.reflectiveObjects.NotImplementedException

import static pl.comarch.patterns.construct.abstractFactory.CarType.*

/**
 * Created by Asia on 2015-11-29.
 */
class CarFactoryTest extends Specification {
    def "BuildCar"() {
        expect:
        CarFactory.buildCar(SUV) instanceof SuvCar
        CarFactory.buildCar(LUXURY) instanceof LuxuryCar

    }
    def "test not implemented car type"(){
        when:
        CarFactory.buildCar(SEDAN)
        then:
        thrown(NotImplementedException)
    }


}
