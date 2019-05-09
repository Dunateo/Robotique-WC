package carto.implementations;

import carto.interfaces.Cartograph;
import gps.interfaces.Position;

public class Cartographie implements Cartograph {

    /**
     * renvoie la limite de vitesse 
     * @param position
     * @return
     */
    @Override
    public float getSpeedLimit(Position position) {
        return 80;
    }
}
