package gps;

import gps.implementations.GPSPosition;
import gps.interfaces.Position;
import regulateur.implementations.Regulator;

public class TestRegulateur {
    public static void main(String[] args){
        Position position = new GPSPosition();
        Regulator regulateur = new Regulator();

        regulateur.start(120);
        regulateur.calcTargetSpeed(position);
    }
}
