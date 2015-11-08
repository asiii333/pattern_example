package pl.comarch.patterns.structural.decorator;

/**
 * Created by Asia on 2015-11-08.
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
