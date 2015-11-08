package pl.comarch.patterns.solid.restauracja.good.potrawy;

import pl.comarch.patterns.solid.restauracja.good.skladniki.Skladnik;

import java.util.ArrayList;

/**
 * Created by Asia on 2015-10-18.
 */
public class Pomidorowa  extends Zupa{
    public Pomidorowa(){
        this.setNazwa("Pomidorowa");
    }
    public Pomidorowa(ArrayList<Skladnik> skladniki){
        super(skladniki);
        this.setNazwa("Pomidorowa");
    }
    public void actionsBeforeAddComponents() {
        generalActivities();
        specializedActivities();

    }
    private void generalActivities(){
        super.actionsBeforeAddComponents();
    }
    private void specializedActivities(){

        System.out.println("dodaj koncentrat");
    }
}
