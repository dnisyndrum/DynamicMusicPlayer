package dnisyndrum.dynamicmusicplayer;

import java.util.*;

/**
 * Created by Dni Syndrum on 1/26/2017.
 */

/*
A SongSet object will store a queue of Song objects. It will be able to
create new Song objects and add them to that queue, shuffle that queue,
and subtract Songs from it as well.
The SongSet itself will have properties for when time of day it should
play and what travelling speed the SongSet will play at.
*/

public class SongSet {

    //properties
    String thisSongSet;

    //constructor
    public SongSet(String songSetTime){
        //4 total songset are instantiated, one for each daily time period
        thisSongSet = songSetTime;
    }

    //getters
    String getSongSetType(){return thisSongSet;}


    //properties

        //low speed at which SongSet will play
        //high speed at which SongSet will play
        //high time
        //low time

        //add Song to queue function
        //shuffle queue function
        //delete song from queue function

}
