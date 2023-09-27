package ru.zinovev.spring_start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {


    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    private List<Music> musicList;

    private Music music1;
    private Music music2;

    @Autowired
    public void injectionMethod(@Qualifier("rockMusicBean") Music music3) {
        System.out.println("Successful injection!");
        this.music3 = music3;
    }

    private Music music3;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    @Autowired
    public MusicPlayer(@Qualifier("rockMusicBean") Music music1, @Qualifier("rapMusicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playSounds() {
        System.out.println("Now we will play:");
        for (Music mus : this.musicList) {
            System.out.println(mus.getSound());
        }
    }


    public void playSound(MusicGenre musicGenre) {
        switch (musicGenre) {
            case RockMusic -> System.out.println("Playing " + music1.getSound());
            case RapMusic -> System.out.println("Playing " + music2.getSound());
        }
    }
}
