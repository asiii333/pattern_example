package pl.comarch.patterns.construct.abstractFactory;

/**
 * Created by Asia on 2015-11-29.
 */
public abstract class Car {
    private Location location;
    private CarType type;

    public Car(CarType type, Location location) {
        this.location = location;
        this.type = type;
    }

    public abstract void construct();
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
