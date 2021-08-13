package by.aleksandr.demidovich;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Demidovich
 */
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;


    public MusicPlayer(){}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusicList(){
        System.out.println("Playing: ");
        for(Music m:musicList){
            System.out.println(m.getSong());
        }
    }


}
