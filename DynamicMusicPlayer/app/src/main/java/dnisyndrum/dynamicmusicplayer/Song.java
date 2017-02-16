package dnisyndrum.dynamicmusicplayer;

/**
 * Created by Dni Syndrum on 1/26/2017.
 */

/*
Each song object will be representative of a music track stored in memory
on the user's device. It will store the location in memory, track duration,
artist's/composer's name, and the track title. Every song object will be
part of a queue stored in a SongSet object.
*/
public class Song {

    private long id;
    private String title;
    private String artist;

    //constructor
    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    //add song to songset
    public void addSong(){

    }

    //getters
    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}

}
