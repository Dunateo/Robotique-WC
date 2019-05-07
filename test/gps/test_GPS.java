package gps;

import gps.interfaces.*;
import gps.implementations.*;

import java.util.Scanner;

public class test_GPS {
    public static void main(String[] args){
        Coordinate test = new Latitude();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez la valeur en radians");
        int rad = keyboard.nextInt();

        test.setValue(rad);

        System.out.println(test.getDeg());
        System.out.println(test.toString());
    }
}
