package org.example;

public  abstract class Alien implements MovingAbilities {
    String name;
    int canJumpHight;
    int canJumpCount;
    int canRun;


    public Alien(String name, int canJumpHight, int canJumpCount, int canRun) {
        this.name = name;
        this.canJumpHight = canJumpHight;
        this.canJumpCount = canJumpCount;
        this.canRun = canRun;
    }

}
