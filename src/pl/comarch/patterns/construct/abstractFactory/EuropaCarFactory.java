package pl.comarch.patterns.construct.abstractFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Asia on 2015-11-29.
 */
public class EuropaCarFactory {
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case SUV:
                car = new SuvCar(Location.EUROPE);
                break;

            case SEDAN:
                break;
            case LUXURY:
                car = new LuxuryCar(Location.EUROPE);
                break;

            default:
                throw new NotImplementedException();
        }
        return car;
    }
}
