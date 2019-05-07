package regulateur.implementations;

import carto.implementations.Cartographie;
import carto.interfaces.Cartograph;
import gps.interfaces.Coordinate;
import gps.interfaces.Position;
import regulateur.interfaces.Manager;
import regulateur.interfaces.Calculator;

public class Regulator implements Manager, Calculator{
    private boolean working;
    private float targetSpeed;

    public Regulator(){
        working = false;
    }

    public boolean isWorking(){
        return working;
    }

    public int start(float speed){
        working = true;
        targetSpeed = speed;
        return 0;
    }

    public int stop(){
        working = false;

        return 0;
    }

    public float calcTargetSpeed(Position position){
        float speed = 0.0f;

        if(isWorking()){
            Cartograph carto = new Cartographie();
            speed = carto.getSpeedLimit(position);
            System.out.println("Speed limit is " + speed + " Km/h");
            if(targetSpeed > speed){
                System.out.println("ATTENTION ! Vous avez demandé une vitesse trop élevé (" + targetSpeed + " Km/h)");
            }
            System.out.println("La vitesse est reglée à " + speed + " Km/h");
        }

        return speed;
    }
}
