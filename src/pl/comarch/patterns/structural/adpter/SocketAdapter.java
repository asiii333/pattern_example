package pl.comarch.patterns.structural.adpter;

/**
 * Created by Asia on 2015-11-28.
 * adapter gniazdka aby zwracal inne wartosci niz tylko europejskie
 */
public interface SocketAdapter {
    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
