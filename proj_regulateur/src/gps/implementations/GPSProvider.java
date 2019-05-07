package gps.implementations;

import gps.interfaces.ModuleGPS;
import gps.interfaces.Position;

public class GPSProvider implements ModuleGPS {
    Position position;

    Position getPosition(){
        System.out.println("Hop la c'est la position");
        return position;
    }
}
