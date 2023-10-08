package ru.zinovev.SpringCore;

import org.springframework.stereotype.Component;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSound() {
        return "Classical Music!!!";
    }

    @Override
    public String[] getSounds() {
        return new String[0];
    }
}
