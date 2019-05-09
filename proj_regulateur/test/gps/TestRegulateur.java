package gps;

import gps.exception.BadDataException;
import gps.exception.SatOutOfConException;
import gps.implementations.GPSProvider;
import gps.interfaces.ModuleGPS;
import gps.interfaces.Position;
import regulateur.implementations.Regulator;

import java.util.Scanner;

public class TestRegulateur {
    public static void main(String[] args){
        ModuleGPS GPS = new GPSProvider();
        Regulator regulateur = new Regulator();
        Position position = null;

        try{
            position = GPS.getPosition();
        }catch(SatOutOfConException conEx){

        }catch(BadDataException datEx){

        }

        System.out.println("Vitesse désirée ? ");
        Scanner keyboard = new Scanner(System.in);
        float vit = keyboard.nextFloat();

        regulateur.start(vit);
        regulateur.calcTargetSpeed(position);
    }
}
