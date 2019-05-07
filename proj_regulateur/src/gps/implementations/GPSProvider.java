package gps.implementations;

import gps.interfaces.ModuleGPS;
import gps.interfaces.Position;

public class GPSProvider implements ModuleGPS {
    Position position;

    Position getPosition(){
        return position;
    }
}
