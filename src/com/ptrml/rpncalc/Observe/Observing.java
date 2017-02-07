package com.ptrml.rpncalc.Observe;

/**
 * interfejs so metodi za observerot
 */
public interface Observing {

    /**
     * metodot koj go povikuva subjektot za da go izvesti za napravenata promena
     */
    void notifyObserving();

    /**
     * se otkazuva od nadgleduvanjeto na subjektot
     */
    void unregister();
}
