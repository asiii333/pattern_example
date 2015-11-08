package pl.comarch.patterns.solid.restauracja.good.potrawy;

import pl.comarch.patterns.solid.restauracja.good.skladniki.Skladnik;

import java.util.ArrayList;

/**
 * Created by Asia on 2015-10-18.
 */
public class Rosl extends Zupa {

    /*public Rosl(){
        this.setNazwa("Rosol");
    }*/
    public Rosl(ArrayList<Skladnik> skladniki){
        super(skladniki);
        this.setNazwa("Rosol");
    }
    public void actionsBeforeAddComponents() {
        super.actionsBeforeAddComponents();
        System.out.println("dodaj kostke rosolowa");
/*
        generalActivities();
        specializedActivities();
*/

    }
/*    private void generalActivities(){
        super.actionsBeforeAddComponents();
    }
    private void specializedActivities(){

        System.out.println("dodaj kostke rosolowa");
    }*/
}
