package com.ptrml.rpncalc.UndoHandler;

/**
 * Created by ptrml on 2/11/2017.
 */
public interface MementoOriginator {

    void setState(Memento memento);
    Memento createMemento();
}
