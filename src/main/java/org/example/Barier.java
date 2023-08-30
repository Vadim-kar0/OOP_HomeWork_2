package org.example;

public class Barier extends Obstacle{
    int hight;
    public Barier(String name) {
        super(name);
    }

    public Barier(String name, int hight) {
        super(name);
        this.hight = hight;
    }
}
