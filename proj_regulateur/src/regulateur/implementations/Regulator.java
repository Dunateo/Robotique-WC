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

    /**
     * renvoie si le régulateur est en fonctionnement
     * @return
     */
    public boolean isWorking(){
        return working;
    }

    /**
     * démarrage
     * @param speed
     * @return
     */
    public int start(float speed){
        working = true;
        targetSpeed = speed;
        return 0;
    }

    /**
     * arret
     * @return
     */
    public int stop(){
        working = false;
        return 0;
    }

    /**
     * calcule la vitesse maximale 
     * @param position
     * @return
     */
    public float calcTargetSpeed(Position position){
        float speed;

        Cartograph carto = new Cartographie();
        speed = carto.getSpeedLimit(position);

        return speed;
    }
}
