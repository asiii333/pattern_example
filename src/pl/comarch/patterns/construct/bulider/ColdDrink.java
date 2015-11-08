package pl.comarch.patterns.construct.bulider;

/**
 * Created by Asia on 2015-11-03.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}