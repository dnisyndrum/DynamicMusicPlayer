package dnisyndrum.dynamicmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class SongSetSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_set_settings);
    }

    public void saveOnClick(View view){
        finish();
    }

    public void morningOnClick(View view){
        Intent goToMorningSettings = new Intent(this, MorningSettings.class);
        startActivity(goToMorningSettings);
    }

    public void afternoonOnClick(View view){
        Intent goToAfternoonSettings = new Intent(this, AfternoonSettings.class);
        startActivity(goToAfternoonSettings);
    }

    public void eveningOnClick(View view){
        Intent goToEveningSettings = new Intent(this, EveningSettings.class);
        startActivity(goToEveningSettings);
    }

    public void nightOnClick(View view){
        Intent goToNightSettings = new Intent(this, NightSettings.class);
        startActivity(goToNightSettings);
    }
}
