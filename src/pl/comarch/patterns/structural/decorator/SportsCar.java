package pl.comarch.patterns.structural.decorator;

/**
 * Created by Asia on 2015-11-08.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
