package ru.zinovev.SpringCore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("rapMusicBean")
@Scope("prototype")
public class RapMusic implements Music {
    private final String[] songs = {"songRap1", "songRap2", "songRap3"};

    @Override
    public String getSound() {
        return songs[new Random().nextInt(this.songs.length)];
    }

    @Override
    public String[] getSounds() {
        return songs.clone();
    }
}
