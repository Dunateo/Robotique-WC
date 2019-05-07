package gps.implementations;

import gps.interfaces.Coordinate;

/**
 *
 */
public class Latitude implements Coordinate {
    //ATTRIBUTES
    /**
     * @var     : value
     * @type    : float
     *
     * @desc    : Gives a concatenated form of the coordinate
     */
    private float value;

    /**
     * @var     : angleMax
     * @type    : int
     *
     * @desc    : constant for max value
     */
    private final int angleMax = 180;

    /**
     * @var     : convertConst
     * @type    : int
     *
     * @desc    : constant to convert from degrees to min / sec
     */
    private final int convertConst = 60;
    //END OF ATTRIBUTES

    /**
     *
     * @return  : float
     */
    public float getDeg() {
        return (float) ((angleMax * this.value) / Math.PI);
    }

    /**
     *
     * @return  : float
     */
    public float getMin() {
        int decimal = (int) getDeg();
        float val = getDeg() - decimal;
        return val * convertConst;
    }

    /**
     *
     * @return  : float
     */
    public float getSec() {
        int decimal = (int) getMin();
        float val = getMin() - decimal;
        return val * convertConst;
    }

    /**
     *
     * @return  : float
     */
    public float getValue() {
        return this.value;
    }

    /**
     * @param   val Valeur de l'angle en radians
     */
    public void setValue(final float val) {
        float myval = val;
        if (myval < 0) {
            while (myval < -(Math.PI / 2)) {
                myval += Math.PI;
            }
        } else if (myval > 0) {
            while (myval > (Math.PI / 2)) {
                myval -= Math.PI;
            }
        }

        value = myval;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        char orient;
        if (getDeg() >= 0) {
            orient = 'N';
        } else {
            orient = 'S';
        }

        return "Latitude{" + (int) Math.abs(getDeg()) + "°"
                + (int) Math.abs(getMin()) + "\'"
                + (int) Math.abs(getSec()) + "\"" + orient + '}';
    }
}
