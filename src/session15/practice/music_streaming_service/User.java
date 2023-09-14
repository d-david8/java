package session15.practice.music_streaming_service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private String userName;
    private List<Song> playList = new ArrayList<>();

    private boolean isShuffled;

    public User(String userName) {
        this.userName = userName;
    }

    public void addToPlaylist(Song song) {
        playList.add(song);
    }

    public void shuffle() {
        Collections.shuffle(playList);
        isShuffled = true;
    }

    public void playPlayLis() {
        for (Song song : playList) {
            song.playSong();
        }
    }

    public void repeatSong(Song song, boolean isRepeatable) {
        while (isRepeatable) {
            song.playSong();
        }
    }
}
