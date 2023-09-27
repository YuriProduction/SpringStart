package ru.zinovev.spring_start;


import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
@ComponentScan("ru.zinovev.spring_start")
public class SpringConfig {
    @Bean
    public MusicPlayer musicPlayerBean() {
        return new MusicPlayer(rapMusicBean(), rockMusicBean());
    }

    @Bean
    public RapMusic rapMusicBean() {
        return new RapMusic();
    }

    @Bean
    public RockMusic rockMusicBean() {
        return RockMusic.getRockMusic();
    }

    @Bean
    public JazzMusic jazzMusicBean() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(RockMusic.getRockMusic(), rapMusicBean(), new JazzMusic());
    }

}
