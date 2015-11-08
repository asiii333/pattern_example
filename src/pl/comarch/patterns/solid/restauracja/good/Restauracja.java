package pl.comarch.patterns.solid.restauracja.good;

/**
 * Created by Asia on 2015-10-18.
 */
public class Restauracja {
    private IDostawca dostawca;
    private IKucharz kucharz;
    private IPotrawa potrawa;

    public Restauracja(IKucharz kucharz){
        this.kucharz = kucharz;
    }
    public void noweZamowienie(IPotrawa potrawa, IDostawca dostawca){
        this.potrawa = potrawa;
        this.dostawca = dostawca;
        hendleOrder();
    }
    private void hendleOrder(){
        //dostawca.przygotuj();
        gotuj();
        dostarcz();
    }

    private void gotuj(){
        kucharz.gotuj(potrawa);

    }
    private void dostarcz(){
        dostawca.dostarcz();
    }
}
