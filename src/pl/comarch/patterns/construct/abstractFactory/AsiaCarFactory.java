package pl.comarch.patterns.construct.abstractFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Asia on 2015-11-29.
 */
public class AsiaCarFactory {
    public static Car buildCar(CarType type){
        Car car = null;
        switch (type)
        {
            case SUV:
                car = new SuvCar(Location.ASIA);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.ASIA);
                break;

            default:
                throw new NotImplementedException();
        }
        return car;
    }
}
