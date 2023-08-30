package org.example;

public class Track extends Obstacle{
    int distance;

    public Track(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    public Track(String name) {
        super(name);
    }

}
