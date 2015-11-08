package pl.comarch.patterns.solid.restauracja.good.pracownicy;

import pl.comarch.patterns.solid.restauracja.good.IKucharz;
import pl.comarch.patterns.solid.restauracja.good.IPotrawa;

import java.util.ArrayList;

/**
 * Created by Asia on 2015-10-18.
 */
public class Kucharz implements IKucharz {

    @Override
    public void gotuj(IPotrawa potrawa) {
        potrawa.actionsBeforeAddComponents();
        potrawa.przygotujSkladniki();
        potrawa.gotuj();
    }
}