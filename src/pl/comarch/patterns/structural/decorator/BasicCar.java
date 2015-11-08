package pl.comarch.patterns.structural.decorator;

/**
 * Created by Asia on 2015-11-08.
 */
public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
