package gps;

import gps.implementations.GPSPosition;
import gps.interfaces.Position;
import regulateur.implementations.Regulator;

import java.util.Scanner;

public class TestRegulateur {
    public static void main(String[] args){
        Position position = new GPSPosition();
        Regulator regulateur = new Regulator();

        System.out.println("Vitesse désirée ? ");
        Scanner keyboard = new Scanner(System.in);
        float vit = keyboard.nextFloat();

        regulateur.start(vit);
        regulateur.calcTargetSpeed(position);
    }
}
