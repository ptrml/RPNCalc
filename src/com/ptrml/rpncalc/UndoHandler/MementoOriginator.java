package com.ptrml.rpncalc.UndoHandler;

/**
 * Created by ptrml on 2/11/2017.
 */
public interface MementoOriginator {

    public void setState(Memento memento);
    public Memento createMemento();
}
