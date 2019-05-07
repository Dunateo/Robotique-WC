package gps.interfaces;

/**
 * @interface   : Coordinate
 * @desc        : Used to represent a GPS Coordinate
 */
public interface Coordinate {
    //METHODS
    /**
     * @func    : getDeg();
     * @params  : void
     * @desc    : gives the degree value of the coordinate
     *
     * @return  : float
     */
    abstract float getDeg();

    /**
     * @func    : getMin();
     * @params  : void
     * @desc    : gives the minute value of the coordinate
     *
     * @return  : float
     */
    abstract float getMin();

    /**
     * @func    : getSec();
     * @params  : void
     * @desc    : gives the second value of the coordinate
     *
     * @return  : float
     */
    abstract float getSec();

    /**
     * @func    : getValue();
     * @params  : void
     * @desc    : gives the concatenated form of the value of the coordinate
     *
     * @return  : float
     */
    abstract float getValue();
    abstract void setValue(float value);

    /**
     * @func    : toString();
     * @params  : void
     * @desc    : gives the string corresponding to the coordinate value
     *
     * @return  : String
     */
    public String toString();
    //END OF METHODS
}
