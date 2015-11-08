package pl.comarch.patterns.solid.restauracja.good.pracownicy;

import pl.comarch.patterns.solid.restauracja.good.IKelner;

/**
 * Created by Asia on 2015-10-21.
 */
public class Kelner implements IKelner{
    @Override
    public void dostarcz() {
        System.out.println("niose zuper do stolika");
    }

    @Override
    public void nakryjStol() {
        System.out.println("nakryj stół");
    }

    @Override
    public void zbierzNaczynia() {
        System.out.println("zbierz naczynia");
    }

    @Override
    public void przygotuj() {
        nakryjStol();
        zbierzNaczynia();

    }
}
