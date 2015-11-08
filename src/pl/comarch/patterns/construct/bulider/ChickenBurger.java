package pl.comarch.patterns.construct.bulider;

/**
 * Created by Asia on 2015-11-03.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
