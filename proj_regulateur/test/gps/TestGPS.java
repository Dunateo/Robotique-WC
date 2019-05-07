package gps;

import gps.interfaces.*;
import gps.implementations.*;

import java.util.Scanner;

public class TestGPS {
    public static void main(String[] args){
        Coordinate test = new Latitude();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez la valeur en radians (latitude) et pas en degré!");
        int rad = keyboard.nextInt();

        test.setValue(rad);

        System.out.println(test.getDeg());
        System.out.println(test.toString());

        test = new Longitude();
        System.out.println("Entrez la valeur en radians (longitude) et pas en degré!");
        rad = keyboard.nextInt();

        test.setValue(rad);

        System.out.println(test.getDeg());
        System.out.println(test.toString());
    }
}
