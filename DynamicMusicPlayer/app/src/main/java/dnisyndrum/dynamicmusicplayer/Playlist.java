package dnisyndrum.dynamicmusicplayer;

/**
 * Created by Dni Syndrum on 1/26/2017.
 */

/*
A Playlist is an object that stores several SongSets. Each Playlist can have
SongSets added or subtracted from it. It will contact a unique name, and a
user can load a new Playlist to change current playing music.
*/

public class Playlist {

    //properties
    private final String[] songSetTypes = {"morning", "afternoon", "evening", "night"};
    private SongSet[] arrayOfSongSets;
    private String playListName;
    private boolean playListCurrentlyLoaded;

    //constructor
    public Playlist(){
        //instantiate 4 songset objects
        for(int i = 0; i < 4; i++) {
            arrayOfSongSets[i] = new SongSet(songSetTypes[i]);
        }
    }

    //getters
    String getPlayListName(){return playListName;}
    boolean isPlayListCurerntlyLoaded() {return playListCurrentlyLoaded;}

    //properties

        //array of four SongSet objects
        //Playlist name
        //bool - currently loaded (t/f)

}
