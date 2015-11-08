package pl.comarch.patterns.structural.composit;

/**
 * Created by Asia on 2015-11-07.
 */
public class CompositTest {
    public static void main(String[] args) {
        Shape tri = new Traingle();
        Shape tri1 = new Traingle();
        Shape cir = new Rectangle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
