package pl.comarch.patterns.solid.restauracja.good;

import pl.comarch.patterns.solid.restauracja.good.skladniki.Skladnik;

import java.util.ArrayList;

/**
 * Created by Asia on 2015-10-18.
 */
public interface IPotrawa {
    ArrayList<Skladnik> getSkladniki();
    String getNazwa();
    void actionsBeforeAddComponents();
    void przygotujSkladniki();
    void gotuj();
}
