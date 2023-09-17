package session15.homework.equals_hashcode;

import java.util.Objects;

/*
 * Create a Song class with title, artist, and length fields. Implement the equals() method to
 * check only the title and artist fields. Implement the hashCode() method to use the title and
 * artist fields to calculate the hash code. Test that two instances with the same title and artist
 * return true for equals() and have the same hash code.
 * */
public class Song {
    private String title;
    private String artist;
    private int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Song song = (Song) obj;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    public static void main(String[] args) {
        Song song1 = new Song("Song Title", "Artist Name", 240);
        Song song2 = new Song("Song Title", "Artist Name", 210);

        System.out.println("Are the songs equal? " + song1.equals(song2));
        System.out.println("Hash code for song1: " + song1.hashCode());
        System.out.println("Hash code for song2: " + song2.hashCode());
    }
}
