package com.ptrml.rpncalc.UndoHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ptrml on 2/11/2017.
 */
public class MementoCaretaker {
    private List<Memento> undoList;
    private List<Memento> redoList;
    private static MementoCaretaker instance;

    public MementoCaretaker() {
        this.undoList = new ArrayList<>();
        this.redoList = new ArrayList<>();
    }

    public static MementoCaretaker getInstance()
    {
        if(instance == null) {
            synchronized (MementoCaretaker.class)
            {
                instance = new MementoCaretaker();
            }
        }
        return instance;
    };

    public void addMemento(Memento coreMemento)
    {
        undoList.add(coreMemento);
        redoList.clear();
    };

    public void undo(MementoOriginator originator){
        if(undoList.size()-1 < 0)
            return;

        redoList.add(originator.createMemento());

        Memento coreMemento = undoList.get((undoList.size()-1));
        originator.setState(coreMemento);
        undoList.remove(coreMemento);

    };

    public void redo(MementoOriginator originator){
        if(redoList.size()-1 < 0)
            return;


        undoList.add(originator.createMemento());

        Memento coreMemento = redoList.get((redoList.size()-1));
        originator.setState(coreMemento);
        redoList.remove(coreMemento);

    };
}
