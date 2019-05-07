package carto.implementations;

import carto.interfaces.Cartograph;
import gps.interfaces.Position;

public class Cartographie implements Cartograph {
    @Override
    public float getSpeedLimit(Position position) {
        return 80;
    }
}
