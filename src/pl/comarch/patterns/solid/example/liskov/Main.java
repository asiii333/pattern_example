package pl.comarch.patterns.solid.example.liskov;

/**
 * Created by Asia on 2015-10-21.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectange = new Rectangle();
        Squere squere = new Squere();
        rectange.setWidth(10);
        squere.setWidth(10);
        rectange.setHeight(5);
        squere.setHeight(5);

        System.out.println("Outcome rectangle: " + rectange.getArea());
        System.out.println("Outcome squere: " + squere.getArea());
    }
}
