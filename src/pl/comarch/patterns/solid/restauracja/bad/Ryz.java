package pl.comarch.patterns.solid.restauracja.bad;

/**
 * Created by Asia on 2015-10-18.
 */
public class Ryz extends Skladnik {
    @Override
    public String toString() {
        return "ryz";
    }

    public void gotuj() {
        System.out.println("Gotowanie ryzu");
    }
}
