package pl.comarch.patterns.structural.adpter;

/**
 * Created by Asia on 2015-11-28.
 * klasa reprezntuje europejskie gniazdko ktore jak chuj zwraca tylko 120 volt
 */

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
