package regulateur.interfaces;

/**
 * @interface   : Manager
 * @desc        : Used to manage speed
 */
public interface Manager {
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
    int start(float speed);

    /**
     * @func    : stop()
     * @param   : void
     * @desc    : Stops the regulator system
     *
     * @return  : int (error code)
     */
    int stop();
}
