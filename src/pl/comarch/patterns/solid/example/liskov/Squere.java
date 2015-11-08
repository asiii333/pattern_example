package pl.comarch.patterns.solid.example.liskov;

/**
 * Created by Asia on 2015-10-21.
 */
public class Squere extends Rectangle{
    void setWidth(int x){
        this.x = x;
        this.y = x;
    }
    void setHeight(int y){
        this.x = y;
        this.y = y;
    }
}
