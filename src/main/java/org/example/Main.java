package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alien> aliens = new ArrayList<>(Arrays.asList(
                new Bot("Bot1",40,6,500),
                new Bot("Bot2",60,5,500),
                new Bot("SuperBot",1000,1000,5000),
                new Human("Human1",55,3,200),
                new Human("Human2",65,4,300),
                new Human("Human3",75,2,400),
                new MutatedCat("Barsik1",10,3,150),
                new MutatedCat("Barsik2",10,3,150),
                new MutatedCat("SuperBarsik1",100,30,1500)));
        Obstacle[] obstacles = {
                new Track("track1",100),
                new Barier("barier1",25),
                new Track("track2",100),
                new Barier("barier2",25),
                new Track("track3",100),
                new Barier("barier3",25)
        };


        for (Alien alien : aliens) {
            for (Obstacle obstacle : obstacles) {
                if(obstacle instanceof Track && alien.name != null){
                    if (!alien.running((Track) obstacle)){
                        alien.name = null;


                    }
                } else if (obstacle instanceof Barier && alien.name != null){
                    if (!alien.jumping((Barier) obstacle)){
                        alien.name = null;
                    }
                }
            }
        }

        for (Alien alien : aliens) {
            if(alien.name != null){
                System.out.println(alien.name + " - прошёл испытания");
            }
        }

    }
}