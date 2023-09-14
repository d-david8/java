package session15.practice.music_streaming_service;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Song> allSongs = new ArrayList<>();

    public void addSong(Song song){
        allSongs.add(song);
    }
}
