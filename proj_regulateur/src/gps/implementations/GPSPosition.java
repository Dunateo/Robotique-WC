package gps.implementations;

import gps.interfaces.Coordinate;
import gps.interfaces.Position;

public class GPSPosition implements Position {
    public Coordinate getLatitude(float angle){
        Coordinate lat = new Latitude();
        lat.setValue(angle);
        return lat;
    }

    public Coordinate getLongitude(float angle){
        Coordinate lon = new Longitude();
        lon.setValue(angle);
        return lon;
    }
}
