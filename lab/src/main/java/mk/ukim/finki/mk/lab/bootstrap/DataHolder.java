package mk.ukim.finki.mk.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.mk.lab.model.Album;
import mk.ukim.finki.mk.lab.model.Artist;
import mk.ukim.finki.mk.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder
{
    public static List<Artist> artists;
    public static long nextArtistId = 0;

    public static List<Song> songs;
    public static long nextSongId = 0;

    public static List<Album> albums;


    @PostConstruct
    public void init()
    {
        artists = new ArrayList<>();

        artists.add(new Artist(nextArtistId++, "Adele", "Adkins", "Someone Like You"));
        artists.add(new Artist(nextArtistId++, "Ed Sheeran", "Sheeran", "Shape of You"));
        artists.add(new Artist(nextArtistId++, "Taylor Swift", "Swift", "Love Story"));
        artists.add(new Artist(nextArtistId++, "Billie Eilish", "O'Connell", "Bad Guy"));
        artists.add(new Artist(nextArtistId++, "The Beatles", "Lennon/McCartney", "Hey Jude"));
        songs = new ArrayList<>();


        ArrayList<Artist> songArtis = new ArrayList<>();
        songArtis.add(artists.get(0));

        ArrayList<Artist> songArtis1 = new ArrayList<>();
        songArtis1.add(artists.get(1)); // Freddie Mercury

        ArrayList<Artist> songArtis2 = new ArrayList<>();
        songArtis2.add(artists.get(2)); // Elvis Presley

        ArrayList<Artist> songArtis3 = new ArrayList<>();
        songArtis3.add(artists.get(3)); // Aretha Franklin

        ArrayList<Artist> songArtis4 = new ArrayList<>();
        songArtis4.add(artists.get(4)); // David Bowie


        albums = new ArrayList<>();
        albums.add(new Album("21", "Pop", "2011")); // Adele
        albums.add(new Album("Divide", "Pop", "2017")); // Ed Sheeran
        albums.add(new Album("Fearless", "Country/Pop", "2008")); // Taylor Swift
        albums.add(new Album("When We All Fall Asleep, Where Do We Go?", "Alternative/Pop", "2019")); // Billie Eilish
        albums.add(new Album("Abbey Road", "Rock", "1969")); // The Beatles



        songs.add(new Song(String.valueOf(nextSongId++),"Someone Like You", "Pop", 2011,songArtis, albums.get(0)));
        songs.add(new Song(String.valueOf(nextSongId++),"Shape of You", "Pop", 2017,songArtis1, albums.get(1)));
        songs.add(new Song(String.valueOf(nextSongId++),"Love Story", "Country/Pop", 2008,songArtis2, albums.get(2)));
        songs.add(new Song(String.valueOf(nextSongId++),"Bad Guy", "Alternative/Pop", 2019,songArtis3, albums.get(3)));
        songs.add(new Song(String.valueOf(nextSongId++),"Hey Jude", "Rock", 1969,songArtis4, albums.get(4)));
    }
}
