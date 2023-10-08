package ru.zinovev.SpringCore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("popMusicBean")
@Scope("singleton")
public class PopMusic implements Music {
    @Override
    public String getSound() {
        return "Pop!!!!!";
    }

    @Override
    public String[] getSounds() {
        return new String[0];
    }

}
