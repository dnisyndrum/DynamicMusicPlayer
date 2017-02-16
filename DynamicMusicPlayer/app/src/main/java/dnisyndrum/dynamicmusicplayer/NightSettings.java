package dnisyndrum.dynamicmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class NightSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_settings);
    }

    public void saveOnClick(View view){
        finish();
    }

    public void addOnClick(View view){
        Intent goToAddSong = new Intent(this, AddSong.class);
        startActivity(goToAddSong);
    }

    public void deleteOnClick(View view){
        Intent goToDeleteSong = new Intent(this, DeleteSong.class);
        startActivity(goToDeleteSong);
    }
}
