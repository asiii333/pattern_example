package pl.comarch.patterns.solid.restauracja.good.pracownicy;

import pl.comarch.patterns.solid.restauracja.good.IKurier;

/**
 * Created by Asia on 2015-10-21.
 */
public class Kurier implements IKurier {
    private String adress;

    @Override
    public void setDeliveryAdress(String adress) {
        this.adress = adress;
    }
    @Override
    public void dostarcz() {
        System.out.println("Wioze potrawe do: " + adress);
    }


    public String getDeliveryAdress(){
        return this.adress;
    }
}
