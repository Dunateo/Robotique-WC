package gps.implementations;

import gps.interfaces.ModuleGPS;
import gps.interfaces.Position;

public class GPSProvider implements ModuleGPS {
    Position position;


    /**
     * getteur de position
     * @return
     */
    public Position getPosition(){
        System.out.println("Hop la c'est la position");
        return position;
    }

    /**
     * setteur de position
     * @param position
     */
    public void setPosition(Position position) {
        this.position = position;
    }

}
