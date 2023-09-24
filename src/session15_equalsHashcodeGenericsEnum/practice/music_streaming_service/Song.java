package session15_equalsHashcodeGenericsEnum.practice.music_streaming_service;

public class Song {
    private String name;

    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public void playSong() {
        System.out.println("The " + name + " from " + artist + " is playing");
    }
}
