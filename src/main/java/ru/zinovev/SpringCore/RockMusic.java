package ru.zinovev.SpringCore;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component("rockMusicBean")
public class RockMusic implements Music {


    private final String[] songs = {"songRock1", "songRock2", "songRock3"};

    private RockMusic() {
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Initializing rock bean...");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroying rock bean...");
    }

    @Override
    public String getSound() {

        String song = songs[new Random().nextInt(this.songs.length)];
        return song;
    }

    @Override
    public String[] getSounds() {
        return songs.clone();
    }

}
