package dnisyndrum.dynamicmusicplayer;

import android.icu.text.RelativeDateTimeFormatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.lang.*;

/**
 * Created by Dni Syndrum on 1/26/2017.
 */

/*
A CurrentTime object determines the current time of day or night
and relays that information back to the SongSetSelector. Time
of day is narrowed down to four six-hour options - morning,
afternoon, evening, and night.
*/

public class CurrentTime {

    //properties
    private int hour;
    private int minute;
    private int am_pm;  //am = 0, pm = 1
    Calendar cal;
    Timer timer;

    //constructor
    public CurrentTime() {
        cal = Calendar.getInstance();
        timer = new Timer();
        //updateCurrentTime();
    }

    //getters
    public int getHour(){return hour;}
    public int getMin() {return minute;}
    public int getAM_PM() {return am_pm;}

    private void updateCurrentTime(){
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                hour = cal.get(Calendar.HOUR);
                minute = cal.get(Calendar.MINUTE);
                am_pm = cal.get(Calendar.AM_PM);
            }
        },0, 5000);
    }

}
