package pl.comarch.patterns.construct.abstractFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Asia on 2015-11-29.
 */
public class CarFactory {
    private CarFactory() {
        //Prevent instantiation
    }

    public static Car buildCar(CarType type)
    {
        Car car = null;
        Location location = Location.ASIA; //Read location property somewhere from configuration
        //Use location specific car factory
        switch(location)
        {
            case EUROPE:
                car = EuropaCarFactory.buildCar(type);
                break;
            case ASIA:
                car = AsiaCarFactory.buildCar(type);
                break;
            case AMERICA:
                throw new NotImplementedException();
            default:
                car = EuropaCarFactory.buildCar(type);
        }
        return car;
    }
}
