package gps.interfaces;

import gps.exception.BadDataException;
import gps.exception.SatOutOfConException;

public interface ModuleGPS {
    Position getPosition() throws SatOutOfConException, BadDataException;

    public void setPosition(Position position);
}
