package pl.comarch.patterns.solid.restauracja.good;

/**
 * Created by Asia on 2015-10-18.
 */
public interface IKurier extends IDostawca {
    void setDeliveryAdress(String adress);
    String getDeliveryAdress();
}
