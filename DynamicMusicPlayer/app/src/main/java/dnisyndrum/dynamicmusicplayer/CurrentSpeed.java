package dnisyndrum.dynamicmusicplayer;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Dni Syndrum on 1/26/2017.
 */

/*
A CurrentSpeed object will determine the speed at which a vehicle
is moving and relay that information back to the SongSetSelector
object.
*/

public class CurrentSpeed implements LocationProvider.LocationCallback {

    //properties
    private Location lastLocation;
    private Location currentLocation;
    public int currentSpeed;

    Context context;
    GoogleApiClient mGoogleApiClient;;
    private LocationProvider mLocationProvider;

    //constructor
    public CurrentSpeed(Context con) {
        currentSpeed = 0;

        context = con;
        mLocationProvider = new LocationProvider(context, this);
    }

    //functions
    //get current speed
    //get current location
    //get last location

    private static Double distance(Location one, Location two) {
        int R = 6371000;
        Double dLat = toRad(two.getLatitude() - one.getLatitude());
        Double dLon = toRad(two.getLongitude() - one.getLongitude());
        Double lat1 = toRad(one.getLatitude());
        Double lat2 = toRad(two.getLatitude());
        Double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        Double d = R * c;
        return d;
    }

    private static double toRad(Double d) {
        return d * Math.PI / 180;
    }

    public void handleNewLocation(Location location) {
        //check time, adjust songset accordingly
        //update current speed
    }

}


