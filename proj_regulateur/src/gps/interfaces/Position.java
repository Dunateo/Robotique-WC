package gps.interfaces;

public interface Position {
    Coordinate getLatitude(float angle);
    Coordinate getLongitude(float angle);
}
