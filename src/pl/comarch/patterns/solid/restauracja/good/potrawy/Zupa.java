package pl.comarch.patterns.solid.restauracja.good.potrawy;

import pl.comarch.patterns.solid.restauracja.good.IPotrawa;
import pl.comarch.patterns.solid.restauracja.good.skladniki.Skladnik;

import java.util.ArrayList;

/**
 * Created by Asia on 2015-10-18.
 */
public class Zupa implements IPotrawa {
    private ArrayList<Skladnik> skladniki;
    private String nazwa;

    public Zupa(ArrayList<Skladnik> skladniki){
        this.skladniki = skladniki;
    }

    public Zupa(){}


    public void actionsBeforeAddComponents(){
        System.out.println("Nowa potrawa: " + nazwa);
        System.out.println("Nalewam wody do gara");
    }

    @Override
    public void przygotujSkladniki() {
        for(Skladnik skladnik: getSkladniki()){
            skladnik.przygotujSkladnik();
        }
    }

    @Override
    public void gotuj() {
        System.out.println("Woda ze skladnikami sie gotuje...");
        System.out.println("Koniec! " + nazwa + " gotowe");
    }

    public ArrayList<Skladnik> getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(ArrayList<Skladnik> skladniki) {
        this.skladniki = skladniki;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
