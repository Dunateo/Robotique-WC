package regulateur.interfaces;

/**
 * @interface   : Manager
 * @desc        : Used to manage speed
 */
public interface Manager {
    /**
     * @func    : getSpeed()
     * @params  : void
     * @desc    : Function that returns the actual speed of the system
     *
     * @return  : float (speed)
     */
    float getSpeed();

    /**
     * @func    : getAccel()
     * @params  : void
     * @desc    : Function that returns the actual acceleration
     *
     * @return  : float (acceleration)
     */
    float getAccel();

    /**
     * @func    : isWorking()
     * @params  : void
     * @desc    : Function that tells if the speed regulator is active or not
     *
     * @return  : boolean{
     *     true if regulator is on
     *     false if regulator is off
     * }
     */
    boolean isWorking();

    /**
     * @func    : start()
     * @param   : float
     * @desc    : Starts the regulator system
     *
     * @return  : int (error code)
     */
    int start(float accel);

    /**
     * @func    : stop()
     * @param   : void
     * @desc    : Stops the regulator system
     *
     * @return  : int (error code)
     */
    int stop();
}
