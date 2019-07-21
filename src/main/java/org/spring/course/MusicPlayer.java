package org.spring.course;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    private String name;

    private int volume;

    //IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {}


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        for(int i=0; i < this.musicList.size(); i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }
    }

}
