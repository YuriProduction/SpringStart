package ru.zinovev.spring_start;

import java.util.Random;

public class JazzMusic implements Music {
    private final String[] songs = {"songJazz1", "songJazz2", "songJazz3"};

    @Override
    public String getSound() {
        return songs[new Random().nextInt(this.songs.length)];
    }

    @Override
    public String[] getSounds() {
        return songs.clone();
    }
}
