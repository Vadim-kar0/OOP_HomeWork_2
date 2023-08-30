package org.example;

public class Bot extends Alien implements MovingAbilities {
    public Bot(String name, int canJumpHight, int canJumpCount, int canRun) {
        super(name, canJumpHight, canJumpCount, canRun);
    }

    @Override
    public boolean jumping(Barier barier) {
        if (this.canJumpCount == 0 || barier.hight > this.canJumpHight) {
            System.out.println(this.name +  " - не справился с препятствием - " + barier.name);
            return false;
        }
        else {
            this.canJumpHight -= barier.hight;
            this.canJumpCount--;
            return true;
        }
    }

    @Override
    public boolean running(Track track) {
        if (track.distance > this.canRun) {
            System.out.println(this.name +  " - не справился с препятствием - " + track.name);
            return false;
        } else {
            this.canRun -= track.distance;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Bot{" +
                "name='" + name + '\'' +
                '}';
    }
}
