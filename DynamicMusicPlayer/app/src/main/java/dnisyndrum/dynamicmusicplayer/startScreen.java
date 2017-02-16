package dnisyndrum.dynamicmusicplayer;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class startScreen extends AppCompatActivity //implements LocationProvider.LocationCallback  {
{
    private LocationProvider mLocationProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //mLocationProvider = new LocationProvider(this, this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //mLocationProvider.connect();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //mLocationProvider.disconnect();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_start_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //saves current settings and closes app
    public void btnExit(View view) {

    }

    //shuffles current SongSet
    public void btnShuffle(View view){

    }

    //creates new playlist
    public void btnNewPlaylist(View view){

    }

    public void btnEditSongSets(MenuItem item){
        Intent goToSongSetEdit = new Intent(this, SongSetSettings.class);
        startActivity(goToSongSetEdit);
    }

}


