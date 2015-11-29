package pl.comarch.patterns.construct.abstractFactory;

import static pl.comarch.patterns.construct.abstractFactory.CarType.*;

/**
 * Created by Asia on 2015-11-29.
 */
public class LuxuryCar extends Car {
    public LuxuryCar( Location location){
        super(LUXURY, location);
        construct();

    }
    @Override
    public void construct() {
        System.out.println("Building luxury car");
    }
}
