package pl.comarch.patterns.solid.example.liskov;

/**
 * Created by Asia on 2015-10-21.
 */
public class Rectangle {
    int x;
    int y;

    void setWidth(int x){
        this.x = x;
    }
    void setHeight(int y){
        this.y = y;
    }

    int getArea(){
        return x*y;
    }
}
