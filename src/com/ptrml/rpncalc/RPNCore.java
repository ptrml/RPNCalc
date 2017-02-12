package com.ptrml.rpncalc;

import com.ptrml.rpncalc.UndoHandler.Memento;
import com.ptrml.rpncalc.UndoHandler.MementoOriginator;
import com.ptrml.rpncalc.Observe.Observed;
import com.ptrml.rpncalc.Observe.Observing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RPNCore implements Observed,MementoOriginator {

    private Character state;
    private Character mode;

    private Boolean PROGFlag = false;

    private RPNDisplay display;
    private Double[] memory_slots;
    private RPNStack stack;
    private List<Observing> observers;

    public RPNCore(RPNStack stack) {
        this.stack = stack;
        this.observers = new ArrayList<>();
        this.display = new RPNDisplay();
        this.clearMemory();
    }

    public void clearMemory(){
        this.setState(CharLegend.STATE_NORMAL);
        this.setMode(CharLegend.MODE_DEG);
        this.memory_slots = new Double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        this.getDisplay().setNormalValue("");

    }


    //OBSERVER
    @Override
    public void registerObserver(Observing _obsrv) {
        observers.add(_obsrv);
    }

    @Override
    public void unregisterObserver(Observing _obsrv) {
        observers.remove(_obsrv);
    }

    @Override
    public void notifyObservers() {
        for(Observing observer : observers)
        {
            observer.notifyObserving();
        }
    }

    //MEMENTO
    @Override
    public void setState(Memento coreMemento) {
        stack.flashCurrentStack(coreMemento.getStack());
        this.getDisplay().setNormalValue("");

        if(coreMemento.getDisplayVolatile())
            this.getDisplay().setVolitileValue(coreMemento.getDisplayVal());
        else
            this.getDisplay().setNormalValue(coreMemento.getDisplayVal());


        notifyObservers();
    }

    @Override
    public Memento createMemento() {
        return new Memento(this);
    }

    public Boolean getPROGFlag() {
        return PROGFlag;
    }

    public void setPROGFlag(Boolean PROGFlag) {
        this.PROGFlag = PROGFlag;
    }

    public RPNStack getStack() {
        return stack;
    }

    public RPNDisplay getDisplay(){
        return this.display;
    };

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;

        notifyObservers();
    }

    public Double getMemory_slot(Integer slot) {
        return memory_slots[slot];
    }

    public void setMemory_slot(Integer slot, Double input) {
        this.memory_slots[slot] = input;
    }

    public Character getMode() {
        return mode;
    }

    public void setMode(Character mode) {
        this.mode = mode;

        notifyObservers();
    }
}
