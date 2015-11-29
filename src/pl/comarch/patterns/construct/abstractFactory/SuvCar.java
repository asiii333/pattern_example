package pl.comarch.patterns.construct.abstractFactory;

import static pl.comarch.patterns.construct.abstractFactory.CarType.*;

/**
 * Created by Asia on 2015-11-29.
 */
public class SuvCar extends Car {
    public SuvCar(Location location){
        super(SUV, location );
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building suv car");
    }
}
