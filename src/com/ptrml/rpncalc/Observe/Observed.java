package com.ptrml.rpncalc.Observe;

/**
 * Interfejs so metodi za nadgleduvaniot subjekt
 */
public interface Observed {
    /**
     * dodava observer
     * @param _obsrv Observerot koj se dodava
     */
    void registerObserver(Observing _obsrv);

    /**
     * @param _obsrv Observerot koj go isfrla od listata nadgleduvaci
     */
    void unregisterObserver(Observing _obsrv);

    /**
     * Gi izvestuva observerite deka e napravena promena
     */
    void notifyObservers();
}
