package pl.comarch.patterns.construct.bulider;

/**
 * Created by Asia on 2015-11-03.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}