package pl.comarch.patterns.structural.adpter;

/**
 * Created by Asia on 2015-11-28.
 * Klasa reprezentuje volty z gniazdka ;)
 */
public class Volt {
    private int volts;

    public Volt(int v){
        this.volts=v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volt)) return false;

        Volt volt = (Volt) o;

        if (volts != volt.volts) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return volts;
    }
}
