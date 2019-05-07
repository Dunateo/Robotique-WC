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

    Regulator(){
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
        }

        return speed;
    }
}
